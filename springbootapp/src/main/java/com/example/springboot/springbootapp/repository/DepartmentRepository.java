package com.example.springboot.springbootapp.repository;


import com.example.springboot.springbootapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
}