package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemsAccessories {
    @Id
    private String itemCode;
    private String itemDesc;
    private String verities;
    @Column(columnDefinition = "LONGTEXT")
    private String itemPicture;
    private double unitPriceSale;
    private double unitPriceBuy;
    private int qty;
    private double profitMargin;
    @ManyToOne(cascade = CascadeType.ALL)
    private Supplier supplier;
}
