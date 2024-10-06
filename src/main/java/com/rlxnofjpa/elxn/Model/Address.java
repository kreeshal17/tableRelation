package com.rlxnofjpa.elxn.Model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;
    @OneToOne
    @JoinColumn(name="emp_id")
    private Employee employee;



}