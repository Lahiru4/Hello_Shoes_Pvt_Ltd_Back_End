package lk.ijse.gdse.aad_filal_projdet.dto;

import jakarta.persistence.*;
import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String employeeCode;
    private String name;
    private String profilePicture;
    private String gender;
    private String civilStatus;
    private String designation;
    private String role;
    private String dob;
    private String joinedDate;
    private String attachedBranch;
    private String buildingNo;
    private String address;
    private String mainCity;
    private String postalCode;
    private String contactNumber;
    private String email;
    private String guardianName;
    private String guardianContact;
}
