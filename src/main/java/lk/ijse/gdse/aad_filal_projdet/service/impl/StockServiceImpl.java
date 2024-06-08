package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad_filal_projdet.dto.EmployeeDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ItemsAccessoriesDTO;
import lk.ijse.gdse.aad_filal_projdet.entity.Employee;
import lk.ijse.gdse.aad_filal_projdet.entity.Items;
import lk.ijse.gdse.aad_filal_projdet.entity.ItemsAccessories;
import lk.ijse.gdse.aad_filal_projdet.repo.AccessoriesRepo;
import lk.ijse.gdse.aad_filal_projdet.repo.StockRepo;
import lk.ijse.gdse.aad_filal_projdet.service.StockService;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final StockRepo stockRepo;
    private final AccessoriesRepo accessoriesRepo;
    private final ModelMapper modelMapper;
    @Override
    public String save(ItemDTO itemDTO) {

        if (itemDTO.getItemCode()== "0") {
            stockRepo.save(modelMapper.map(itemDTO, Items.class));
            return RespList.RSP_SUCCESS;
        }
        boolean codeOpt = stockRepo.existsById(itemDTO.getItemCode());
        if (codeOpt){
            return RespList.RSP_DUPLICATED;
        }
        stockRepo.save(modelMapper.map(itemDTO, Items.class));
        return RespList.RSP_SUCCESS;
    }

    @Override
    public String update(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public int countStock() {
        long count = stockRepo.count();
        return Integer.parseInt(String.valueOf(count));
    }

    @Override
    public List<ItemDTO> getAll() {
        List<Items> all = stockRepo.findAll();
        return  modelMapper.map(all, new TypeToken<List<ItemDTO>>() {
        }.getType());
    }

    @Override
    public int countStockAccessories() {
        long count = accessoriesRepo.count();
        return Integer.parseInt(String.valueOf(count));
    }

    @Override
    public String saveAccessories(ItemsAccessoriesDTO itemsAccessoriesDTO) {
        if (itemsAccessoriesDTO.getItemCode()== "0") {
            accessoriesRepo.save(modelMapper.map(itemsAccessoriesDTO, ItemsAccessories.class));
            return RespList.RSP_SUCCESS;
        }
        boolean codeOpt = accessoriesRepo.existsById(itemsAccessoriesDTO.getItemCode());
        if (codeOpt){
            return RespList.RSP_DUPLICATED;
        }
        accessoriesRepo.save(modelMapper.map(itemsAccessoriesDTO, ItemsAccessories.class));
        return RespList.RSP_SUCCESS;
    }
}
