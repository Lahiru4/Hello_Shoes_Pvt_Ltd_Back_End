package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.EmployeeDTO;
import lk.ijse.gdse.aad_filal_projdet.entity.Customer;
import lk.ijse.gdse.aad_filal_projdet.entity.Employee;
import lk.ijse.gdse.aad_filal_projdet.repo.EmployeeRepo;
import lk.ijse.gdse.aad_filal_projdet.service.EmployeeService;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final ModelMapper modelMapper;
    private final EmployeeRepo repo;

    @Override
    public String save(EmployeeDTO employeeDTO) {
        boolean idOpt = repo.existsById(employeeDTO.getEmployeeCode());
        if (idOpt) {
            return RespList.RSP_DUPLICATED;
        }
        boolean emailOpt = repo.existsByEmail(employeeDTO.getEmail());
        if (emailOpt) {
            return RespList.EMAIL_DUPLICATED;
        }
        boolean contactOpt = repo.existsByContactNumber(employeeDTO.getContactNumber());
        if (contactOpt) {
            return RespList.CONTACT_DUPLICATED;
        }
        Employee save = repo.save(modelMapper.map(employeeDTO, Employee.class));
        return save != null ?  RespList.RSP_SUCCESS: RespList.RSP_ERROR;
    }

    @Override
    public List<EmployeeDTO> getAll() {
        List<Employee> all = repo.findAll();
        return  modelMapper.map(all, new TypeToken<List<EmployeeDTO>>() {
        }.getType());
    }

    @Override
    public String update(String code, EmployeeDTO employeeDTO) {
        return null;
    }
}
