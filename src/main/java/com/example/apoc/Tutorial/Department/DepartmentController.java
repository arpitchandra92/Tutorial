package com.example.apoc.Tutorial.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/deleteDepartment/{did}")
    public void deleteDepartment(@PathVariable("did") Long departID)
    {
        departmentService.deleteDepartment(departID);
    }

    @PutMapping("/updateDepartment/{did}")
    public void updateDepartment(@PathVariable("did") Long departID, @RequestParam(required = false) String name,@RequestParam(required = false) Integer number )
    {
        departmentService.updateDepratment(departID, name,number);
    }


}
