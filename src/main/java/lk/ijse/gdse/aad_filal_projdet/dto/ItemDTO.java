package lk.ijse.gdse.aad_filal_projdet.dto;

import lk.ijse.gdse.aad_filal_projdet.entity.Supplier;
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
    private String gender;
    private String occasion;
    private String verities;
    private int size;
    private int qty;

    private double profitMargin;
}
