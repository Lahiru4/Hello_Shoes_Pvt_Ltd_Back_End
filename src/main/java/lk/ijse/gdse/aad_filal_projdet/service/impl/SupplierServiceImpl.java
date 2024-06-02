package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.SupplierDTO;
import lk.ijse.gdse.aad_filal_projdet.entity.Customer;
import lk.ijse.gdse.aad_filal_projdet.entity.Supplier;
import lk.ijse.gdse.aad_filal_projdet.repo.SupplierRepo;
import lk.ijse.gdse.aad_filal_projdet.service.SupplierService;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private ModelMapper modelMapper;
    private final SupplierRepo repo;


    @Override
    public String saveSupplier(SupplierDTO supplierDTO) {
        boolean optCode = repo.existsById(supplierDTO.getSupplierCode());
        boolean optEmail = repo.existsByEmail(supplierDTO.getEmail());
        boolean optContactNumber = repo.existsByContactNumber(supplierDTO.getContactNumber());
        if (optCode) {
            return RespList.EMAIL_DUPLICATED;
        }
        if (optEmail) {
            return RespList.EMAIL_DUPLICATED;
        }
        if (optContactNumber) {
            return RespList.CONTACT_NUMBER_DUPLICATED;
        }

        repo.save(modelMapper.map(supplierDTO, Supplier.class));
        return RespList.RSP_SUCCESS;
    }

    @Override
    public List<SupplierDTO> getAllSupplier() {
        List<Supplier> all = repo.findAll();
        return  modelMapper.map(all, new TypeToken<List<SupplierDTO>>() {
        }.getType());
    }

    @Override
    public String updateSupplier(String supplierCode, SupplierDTO supplierDTO) {
        return null;
    }
}
