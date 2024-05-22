package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    String saveCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> getAllCustomers();
}
