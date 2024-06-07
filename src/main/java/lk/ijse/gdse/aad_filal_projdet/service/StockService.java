package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;

public interface StockService {

    String save(ItemDTO itemDTO);
    String update(ItemDTO itemDTO);

    int countStock();
}
