package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lk.ijse.gdse.aad_filal_projdet.Enum.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Supplier implements SuperEntity{
    @Id
    private String supplierCode;
    private String name;
    private Category category;
    private String brand;
    @Column(unique = true)
    private String contactNumber;
    private String addressNo;
    private String address;
    private String city;
    private String postalCode;
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "supplier")
    private List<Items> itemEntities;

    @OneToMany(mappedBy = "supplier")
    private List<Accessories> accessories;

}
