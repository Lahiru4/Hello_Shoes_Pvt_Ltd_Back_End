package lk.ijse.gdse.aad_filal_projdet.dto;


import lk.ijse.gdse.aad_filal_projdet.Enum.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    private String supplierCode;
    private String name;
    private Category category;
    private String brand;
    private String contactNumber;
    private String addressNo;
    private String address;
    private String city;
    private String postalCode;
    private String email;
}
