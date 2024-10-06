package com.rlxnofjpa.elxn.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Mission {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private int duration;
    @ManyToMany(mappedBy = "mission")
    private List <Employee> employees;
}
