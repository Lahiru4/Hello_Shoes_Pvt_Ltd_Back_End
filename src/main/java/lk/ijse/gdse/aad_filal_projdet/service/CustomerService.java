package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepo customerRepo;


    public String saveCustomer(CustomerDTO customerDTO) {
        return null;
    }
}
