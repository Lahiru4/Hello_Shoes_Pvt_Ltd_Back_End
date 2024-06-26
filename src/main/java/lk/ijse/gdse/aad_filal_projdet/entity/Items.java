package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Items implements SuperEntity {
    @Id
    private String itemCode;
    private String itemDesc;
    @Column(columnDefinition = "LONGTEXT")
    private String itemPicture;
    private double unitPriceSale;
    private double unitPriceBuy;
    private String status; //out stock or in stock
    private String gender;
    private String occasion;
    private String verities;
    private int size;
    private int qty;

    private double profitMargin;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Supplier supplier;
}
