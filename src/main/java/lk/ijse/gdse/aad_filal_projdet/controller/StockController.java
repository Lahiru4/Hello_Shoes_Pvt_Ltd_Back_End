package lk.ijse.gdse.aad_filal_projdet.controller;

import lk.ijse.gdse.aad_filal_projdet.dto.ItemDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ItemsAccessoriesDTO;
import lk.ijse.gdse.aad_filal_projdet.dto.ResponseDTO;
import lk.ijse.gdse.aad_filal_projdet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/stock")
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;
    private final ResponseDTO responseDTO;

    @PostMapping("/save")
    public String save(@RequestBody ItemDTO itemDTO) {
        return stockService.save(itemDTO);
    }

    @PostMapping("/saveAccessories")
    public String save(@RequestBody ItemsAccessoriesDTO itemsAccessoriesDTO) {
        System.out.println(itemsAccessoriesDTO);
        return stockService.saveAccessories(itemsAccessoriesDTO);
    }

    @GetMapping("/countStock")
    private int getCount() {
        return stockService.countStock();
    }

    @GetMapping("/countStockAccessories")
    private int getCountAccessories() {
        return stockService.countStockAccessories();
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        List<ItemDTO> all = stockService.getAll();
        responseDTO.setContent(all);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
