package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    public String save(EmployeeDTO employeeDTO);
    public List<EmployeeDTO> getAll();
    public String update(String code, EmployeeDTO employeeDTO);
}
