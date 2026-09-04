package com.lab2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data                 // getters, setters, equals, hashCode, toString
@NoArgsConstructor     // constructor vacio: obligatorio para Data Binding
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT de MySQL
    private int employee_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "hire_date")
    private String hire_date;

    @Column(name = "job_id")
    private String job_id;

    @Column(name = "salary")
    private String salary;

    @Column(name = "commission_pct")
    private String commission_pct;

    @Column(name = "manager_id")
    private String manager_id;

    @Column(name = "department_id")
    private String department_id;

}
