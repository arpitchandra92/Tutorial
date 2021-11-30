package com.example.apoc.Tutorial.Department;

import com.example.apoc.Tutorial.Student.Student;
import com.example.apoc.Tutorial.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private final DepartmentRepository departmentRepository;
    private final StudentRepository studentRepository;

    public DepartmentService(DepartmentRepository departmentRepository, StudentRepository studentRepository)
    {
        this.departmentRepository = departmentRepository;
        this.studentRepository = studentRepository;

    }

    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentbyID(Long departmentID) {
        return departmentRepository.getById(departmentID);
    }

    public String mixing() {
//        return "Mixing of Student and Department in string method is still ongoing";
       Long id = 1L;
       Student student = studentRepository.getById(id);
//       List<Student> student = studentRepository.findAll();
        Department department = departmentRepository.getById(id);
        return "Student "+student.getName()+" belongs to the department"+department.getName()+" , he/she takes a total of "+department.getNoofcourses();


    }
}
