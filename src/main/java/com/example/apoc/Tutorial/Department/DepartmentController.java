package com.example.apoc.Tutorial.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService)
    {
        this.departmentService = departmentService;
    }

    @GetMapping("/getdepartment")
    public List<Department> getDepartment()
    {
        return departmentService.getDepartment();
    }

    @GetMapping(path = "/getdepartment/{id}")
    public String getDepartmentbyID(@PathVariable("id") Long departmentID)
    {
        return departmentService.getDepartmentbyID(departmentID).toString();

    }
    @GetMapping("/studentanddepartment")
    public String mixing()
    {
        return departmentService.mixing();
    }

}
