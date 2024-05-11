package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/getAllCustomers")
    public ResponseEntity<?> getAllCustomers() {
        return null;
    }

    @PostMapping("/getCustomerById")
    public ResponseEntity<?> getCustomerById() {

        return null;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        String response = customerService.saveCustomer(customerDTO);
        return null;
    }

    @PostMapping("/updateCustomer")
    public ResponseEntity<?> updateCustomer() {

        return null;
    }

    @PostMapping("/deleteCustomer")
    public ResponseEntity<?> deleteCustomer() {

        return null;
    }

}
