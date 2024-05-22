package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.persistence.NoResultException;
import lk.ijse.gdse.aad_filal_projdet.Enum.Level;
import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.entity.Customer;
import lk.ijse.gdse.aad_filal_projdet.repo.CustomerRepo;
import lk.ijse.gdse.aad_filal_projdet.service.CustomerService;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;


    public String saveCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        customerDTO.setJoined_date(LocalDate.now().toString());
        customerDTO.setLevel(Level.NEW);
        customerDTO.setPoints(0);

        boolean opt = customerRepo.existsById(customerDTO.getCustomer_id());
        if (opt) {
            return RespList.RSP_DUPLICATED;
        }else {
            String emailOpt = customerRepo.existsByEmail(customerDTO.getEmail());
            if (emailOpt == null) {
                Customer save = customerRepo.save(modelMapper.map(customerDTO, Customer.class));
                if (save != null) {
                    return RespList.RSP_SUCCESS;
                }
            }else {
                return RespList.RSP_DUPLICATED+"_Email Already Exists";
            }
        }
        return RespList.RSP_FAIL;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        return  modelMapper.map(all, new TypeToken<List<CustomerDTO>>() {
        }.getType());

    }
}
