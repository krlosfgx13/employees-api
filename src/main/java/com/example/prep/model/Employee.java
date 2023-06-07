package com.example.prep.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  nullable = false)
    private Integer id;
    @Column(name = "last_Name",  nullable = false)
    private String lastName;
    @Column(name = "first_Name",  nullable = false)
    private String firstName;
    @Column(name = "position",  nullable = false)
    private String position;
    @Column(name = "salary",  nullable = false)
    private float salary;
    @Column(name = "country", nullable = false)
    private String country;
}
