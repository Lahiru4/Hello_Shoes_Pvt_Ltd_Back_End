package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ResponseDTO;
import lk.ijse.gdse.aad_filal_projdet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/stock")
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;
    private final ResponseDTO responseDTO;
    @PostMapping("/save")
    public String save(ItemDTO itemDTO){
        return stockService.save(itemDTO);
    }
    @GetMapping("/countStock")
    private int getCount(){
        return stockService.countStock();
    }
}
