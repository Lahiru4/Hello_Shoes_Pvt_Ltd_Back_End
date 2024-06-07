package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    private String itemPicture;
    private double unitPriceSale;
    private double unitPriceBuy;
    private String status; //out stock or in stock
    private String Gender;
    private String Occasion;
    private String Verities;
    private int size;
    private int qty;

    private double expectedProfit;
    private double profitMargin;
    @ManyToOne
    private Supplier supplier;
}
