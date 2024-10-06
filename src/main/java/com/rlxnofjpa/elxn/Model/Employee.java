package com.rlxnofjpa.elxn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emp_ko_barema")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(name = "your_email", unique = true, nullable = false)
    private String email;
    @Column(nullable = false)


    private LocalDate dateOfBirth;
    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeeEnum role;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;
@ManyToOne
@JoinTable(
        name="mission_id",
        joinColumns=@JoinColumn(name="employee_id"),
        inverseJoinColumns = @JoinColumn(name="mission_id")
)
    private List<Mission> missions;
}

