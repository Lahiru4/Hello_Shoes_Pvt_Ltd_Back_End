package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.EmployeeDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ResponseDTO;
import lk.ijse.gdse.aad_filal_projdet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final ResponseDTO responseDTO;
    private final EmployeeService employeeService;


    @GetMapping("/getAll")
    public ResponseEntity<?> getAllEmployee(){
        List<EmployeeDTO> allEmployee = employeeService.getAll();
        responseDTO.setContent(allEmployee);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        System.out.println(employeeDTO);
        String opt = employeeService.save(employeeDTO);

        responseDTO.setMessage(opt);
        responseDTO.setContent(employeeDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
