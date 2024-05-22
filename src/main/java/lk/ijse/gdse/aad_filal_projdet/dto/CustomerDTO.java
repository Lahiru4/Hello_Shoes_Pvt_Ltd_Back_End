package lk.ijse.gdse.aad_filal_projdet.dto;

import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {
    private String customer_id;
    private String name;

    private Gender gender;
    private String joined_date;
    private String dob;

    private Level level;
    private int points;
    private String Building_No;
    private String address;

    private String Land;
    private String city;

    private String email;

}
