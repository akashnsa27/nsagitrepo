package com.nsa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "emp_table")
public class Employee {

    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generate
    @Column(name = "emp_id")
    private Integer id;

    @Column(name = "empName")
    private String name;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private Long salary;


    public Employee(String name, String department, Long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
