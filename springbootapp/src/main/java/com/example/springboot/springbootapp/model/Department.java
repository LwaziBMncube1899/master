package com.example.springboot.springbootapp.model;


import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name="department")
public class Department {
    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;

    private  String DepartmentName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }



}
