package lk.ijse.gdse.aad_filal_projdet.repo;

import lk.ijse.gdse.aad_filal_projdet.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, String> {
    boolean existsByEmail(String email);
    boolean existsByContactNumber(String contactNumber);
}
