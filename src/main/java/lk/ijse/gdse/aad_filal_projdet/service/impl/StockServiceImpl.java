package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;
import lk.ijse.gdse.aad_filal_projdet.entity.Items;
import lk.ijse.gdse.aad_filal_projdet.repo.StockRepo;
import lk.ijse.gdse.aad_filal_projdet.service.StockService;
import lk.ijse.gdse.aad_filal_projdet.util.RespList;
import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    private final StockRepo stockRepo;
    private final ModelMapper modelMapper;
    @Override
    public String save(ItemDTO itemDTO) {
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
}
