package com.example.springboot.springbootapp.controller;

import com.example.springboot.springbootapp.service.DepartmentService;
import com.example.springboot.springbootapp.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import javax.validation.Valid;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
private DepartmentService departmentService;

    @GetMapping("create-department")
    public ModelAndView createDepartmentView(){
      ModelAndView modelAndView= new ModelAndView();
      modelAndView.setViewName("departmentForm");
      modelAndView.addObject("department", new Department());
      return  modelAndView;

    }

  @PostMapping("create-department")
    public  ModelAndView createDepartment(@Valid Department department, BindingResult result){
        ModelAndView modelAndView = new ModelAndView();

        if (result.hasErrors()){

            modelAndView.setViewName("departmentForm");
            modelAndView.addObject("department", department);

        }
        departmentService.saveDepartment(department);
        modelAndView.addObject("department");
        return modelAndView;
  }
}
