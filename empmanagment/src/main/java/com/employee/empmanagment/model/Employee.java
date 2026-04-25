package com.employee.empmanagment.model;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //marks class as jpa entity(maps to a table in the database)
@Table(name = "employee")
//don't need to write all code use below shourtcut annotation
@Data //Automatically adds getter,setters,toString,equals
@NoArgsConstructor //No arg constructor (needed by JPA)
@AllArgsConstructor //Constroctor with all field

//this is java class which will become DB table
public class Employee {

    @Id //marks the id field as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto generate the value of ID
//below will define as coulom in db
    private Long id;
    private String name;
    private String Department;
    private double salary;


}
