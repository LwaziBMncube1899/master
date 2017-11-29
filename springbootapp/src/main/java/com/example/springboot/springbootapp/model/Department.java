package com.example.springboot.springbootapp.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Id
   private String DepartmentName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private  Long Id;


}
