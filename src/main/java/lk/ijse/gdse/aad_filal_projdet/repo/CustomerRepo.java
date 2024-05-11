package lk.ijse.gdse.aad_filal_projdet.repo;

import lk.ijse.gdse.aad_filal_projdet.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
}
