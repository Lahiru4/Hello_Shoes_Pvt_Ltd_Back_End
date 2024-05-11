package lk.ijse.gdse.aad_filal_projdet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;

@Entity
public class Order implements Serializable {
    @Id
    private int order_id;
    @ManyToOne
    private Customer customer;
}
