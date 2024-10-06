package com.rlxnofjpa.elxn.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String d_name;
    private String d_location;
@OneToMany(mappedBy = "department")
private List <Employee> employees;
}
