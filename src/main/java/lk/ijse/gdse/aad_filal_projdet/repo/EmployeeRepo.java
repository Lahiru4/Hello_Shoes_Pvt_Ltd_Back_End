package lk.ijse.gdse.aad_filal_projdet.repo;

import lk.ijse.gdse.aad_filal_projdet.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
    boolean existsByEmail(String email);

    boolean existsByContactNumber(String contactNumber);
}
