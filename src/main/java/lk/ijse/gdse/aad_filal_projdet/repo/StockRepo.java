package lk.ijse.gdse.aad_filal_projdet.repo;

import lk.ijse.gdse.aad_filal_projdet.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Items, String> {
}
