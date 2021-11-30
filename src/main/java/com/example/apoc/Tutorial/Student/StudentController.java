package com.example.apoc.Tutorial.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studenservice;

    @Autowired
    public StudentController(StudentService studenservice)
    {
        this.studenservice = studenservice;
    }

    @GetMapping
    public List<Student> getStudents()
    {
        return studenservice.getGreeting();
    }

    @PostMapping
    public void registernewStudent(@RequestBody Student student)
    {
        studenservice.addnewStudent(student);
    }
    @DeleteMapping(path ="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studenservice.deleteStudent(studentId);

    }
    //http://localhost:8080/api/v1/student/1
//    {
//        "name" : "Robert",
//        "email" : "roro@roro.com",
//        "dob" : "1995-12-17"
//    }


}
