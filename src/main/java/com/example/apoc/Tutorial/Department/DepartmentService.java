package com.example.apoc.Tutorial.Department;

import com.example.apoc.Tutorial.Student.Student;
import com.example.apoc.Tutorial.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public void deleteDepartment(Long departID) {
        boolean exists = departmentRepository.existsById(departID);
        if(!exists)
        {
            throw new IllegalStateException("Department doesn't exists");
        }
        departmentRepository.deleteById(departID);
    }

    @Transactional
    public void updateDepratment(Long departID, String name, Integer number) {
        boolean exists = departmentRepository.existsById(departID);
        if(!exists)
        {
            throw new IllegalStateException("Department doesn't exists with that id");
        }
        Department department = departmentRepository.getById(departID);
        if(name !=null && name.length()>0)
        {
            department.setName(name);
        }
        if(number !=null)
        {
            department.setNoofcourses(number);
        }


    }
}
