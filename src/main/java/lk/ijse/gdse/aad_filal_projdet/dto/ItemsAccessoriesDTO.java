package lk.ijse.gdse.aad_filal_projdet.dto;


import lk.ijse.gdse.aad_filal_projdet.entity.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemsAccessoriesDTO {
    private String itemCode;
    private String itemDesc;
    private String verities;
    private String itemPicture;
    private double unitPriceSale;
    private double unitPriceBuy;
    private int qty;
    private double profitMargin;
    private String supplier;
}
