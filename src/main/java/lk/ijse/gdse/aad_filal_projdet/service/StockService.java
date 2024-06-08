package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ItemsAccessoriesDTO;

import java.util.List;


public interface StockService {

    String save(ItemDTO itemDTO);
    String update(ItemDTO itemDTO);

    int countStock();

    public List<ItemDTO> getAll();

    public int countStockAccessories();

    String saveAccessories(ItemsAccessoriesDTO itemsAccessoriesDTO);
}
