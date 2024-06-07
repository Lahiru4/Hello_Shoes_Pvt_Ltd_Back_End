package lk.ijse.gdse.aad_filal_projdet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private String itemCode;
    private String itemDesc;
    private String itemPicture;
    private String supplierCode;
    private String supplierName;
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
}
