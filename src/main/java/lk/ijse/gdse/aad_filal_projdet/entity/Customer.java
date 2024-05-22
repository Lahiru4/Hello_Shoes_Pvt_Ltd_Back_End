package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data@AllArgsConstructor@NoArgsConstructor
@Entity
public class Customer implements Serializable {
    @Id
    private String customer_id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String joined_date;
    private String dob;

    @Enumerated(EnumType.STRING)
    private Level level;
    private int points;

    private String Building_No;
    private String address;
    private String Land;
    private String city;

    @Column(unique = true)
    private String email;

}
