package com.example.apoc.Tutorial.Department;

import com.example.apoc.Tutorial.Student.Student;
import com.example.apoc.Tutorial.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class DepartmentConfig {

    @Autowired
    private final StudentRepository studentRepository;

    public DepartmentConfig(StudentRepository studentRepository)
    {
        this.studentRepository =studentRepository;
    }
    @Bean
    CommandLineRunner commandLineRunner (DepartmentRepository departmentRepository)
    {
        return args -> {
            Department computer = new Department("Computer",6);
            Department electrical = new Department("Electrical",7);
            departmentRepository.saveAll(List.of(computer,electrical));
            Student arpit =
            new Student("Arpit", LocalDate.of(1992, JANUARY,5),"apoc@hotmail.com");
           Student Mariam =
                   new Student("Mariam", LocalDate.of(1994, JANUARY,5),"mariam@hotmail.com");
            studentRepository.saveAll(List.of(arpit,Mariam));
        };
    }
}
