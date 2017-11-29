package com.example.springboot.springbootapp.service;

    import com.example.springboot.springbootapp.repository.DepartmentRepository;
    import com.example.springboot.springbootapp.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

    @Service
    @Transactional

    public class DepartmentService {
        @Autowired
        private DepartmentRepository departmentRepository;


        public List<Department> findAll(){return departmentRepository.findAll();}

        public void saveDepartment(Department  department){departmentRepository.save(department);}

        public void deleteDepartment(Long id){departmentRepository.delete(id);}

        public Department getDepartmentById(Long id){return departmentRepository.findOne(id);}

    }
