package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    String saveSupplier(SupplierDTO supplierDTO);
    List<SupplierDTO> getAllSupplier();
    String updateSupplier(String supplierCode,SupplierDTO supplierDTO);
}
