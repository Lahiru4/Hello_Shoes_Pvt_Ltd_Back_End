package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.CustomerDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ResponseDTO;
import lk.ijse.gdse.aad_filal_projdet.service.CustomerService;
import lk.ijse.gdse.aad_filal_projdet.service.impl.CustomerServiceImpl;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final ResponseDTO responseDTO;

    private final CustomerService customerService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);



    @GetMapping("/getAllCustomers")
    public ResponseEntity<?> getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();

        responseDTO.setCode(RespList.RSP_SUCCESS);
        responseDTO.setMessage(RespList.RSP_SUCCESS);
        responseDTO.setContent(allCustomers);
        System.out.println(allCustomers);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/getCustomerById")
    public ResponseEntity<?> getCustomerById() {

        return null;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        String response = customerService.saveCustomer(customerDTO);
        logger.debug("This is a customer response" + response);
        System.out.println(response);

        /*set response data start*/
        responseDTO.setCode(response);
        responseDTO.setMessage(response);
        responseDTO.setContent(customerDTO);
        /*set response data end*/

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
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
