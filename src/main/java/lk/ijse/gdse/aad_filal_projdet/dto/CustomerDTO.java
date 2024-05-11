package lk.ijse.gdse.aad_filal_projdet.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Level;

import java.io.Serializable;
import java.util.Date;

public class CustomerDTO implements Serializable {
    private String customer_id;
    private String name;

    private Gender gender;
    private Date joined_date;
    private Date dob;

    private Level level;
    private int points;
    private String address;
    private String addressLine2;
    private String city;
    private String postal_code;

    private String email;

}
