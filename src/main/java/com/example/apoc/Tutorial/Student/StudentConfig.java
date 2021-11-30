package com.example.apoc.Tutorial.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student arpit =
//            new Student("Arpit", LocalDate.of(1992, JANUARY,5),"apoc@hotmail.com");
//            Student Mariam =
//                    new Student("Mariam", LocalDate.of(1994, JANUARY,5),"mariam@hotmail.com");
//            studentRepository.saveAll(List.of(arpit,Mariam));
//
//        };
//    }
//}
