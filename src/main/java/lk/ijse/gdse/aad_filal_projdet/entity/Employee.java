package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private String employeeCode;
    private String name;
    @Column(columnDefinition = "LONGTEXT")
    private String profilePicture;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String civilStatus;
    private String designation;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String dob;
    private String joinedDate;
    private String attachedBranch;
    private String buildingNo;
    private String address;
    private String mainCity;
    private String postalCode;
    private String contactNumber;
    @Column(unique = true)
    private String email;
    private String guardianName;
    private String guardianContact;
}
