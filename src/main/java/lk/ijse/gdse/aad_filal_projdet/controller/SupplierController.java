package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.ResponseDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.SupplierDTO;
import lk.ijse.gdse.aad_filal_projdet.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/supplier")
@CrossOrigin
@RequiredArgsConstructor
public class SupplierController {
    private final ResponseDTO responseDTO;

    private final SupplierService supplierService;

    @PostMapping("/save")
    public ResponseEntity<?> saveSupplier(@RequestBody SupplierDTO supplierDTO) {
        String opt = supplierService.saveSupplier(supplierDTO);
        responseDTO.setMessage(opt);
        responseDTO.setContent(supplierDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllSupplier() {
        List<SupplierDTO> allSupplier = supplierService.getAllSupplier();
        responseDTO.setContent(allSupplier);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
