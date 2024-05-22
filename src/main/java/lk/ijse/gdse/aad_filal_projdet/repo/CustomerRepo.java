package lk.ijse.gdse.aad_filal_projdet.repo;

import lk.ijse.gdse.aad_filal_projdet.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer,String> {
    @Query(value = "SELECT email FROM Customer c WHERE c.email = ?1", nativeQuery = true)
    String existsByEmail(String email);
}
