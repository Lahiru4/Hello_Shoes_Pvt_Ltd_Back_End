package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.*;
import lk.ijse.gdse.aad_filal_projdet.Enum.Gender;
import lk.ijse.gdse.aad_filal_projdet.Enum.Level;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Customer implements Serializable {
    @Id
    private String customer_id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date joined_date;
    private Date dob;

    @Enumerated(EnumType.STRING)
    private Level level;
    private int points;
    private String address;
    private String addressLine2;
    private String city;
    private String postal_code;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

}
