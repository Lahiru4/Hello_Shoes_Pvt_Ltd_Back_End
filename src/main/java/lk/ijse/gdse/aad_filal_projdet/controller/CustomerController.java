package lk.ijse.gdse.aad_filal_projdet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @GetMapping("/getAllCustomers")
    public ResponseEntity<?> getAllCustomers() {

        return null;
    }

    @PostMapping("/getCustomerById")
    public ResponseEntity<?> getCustomerById() {

        return null;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveCustomer() {

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
