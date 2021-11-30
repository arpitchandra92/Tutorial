package com.example.apoc.Tutorial;

import com.example.apoc.Tutorial.Student.Student;
import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// annotations makes this class to serve rest end points
public class Greeting {

    @RequestMapping("/greeting") // default is GET, method can be changed to Post
    //Home endpoint
    public List<Student> getGreeting()
    {
        return List.of();
//        return List.of(new Student(1L,"Arpit",30, LocalDate.of(1992,Month.JANUARY,5),"apoc@hotmail.com"));
    }
}
