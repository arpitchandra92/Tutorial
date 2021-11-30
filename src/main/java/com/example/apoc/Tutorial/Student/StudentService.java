package com.example.apoc.Tutorial.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService (StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public List<Student> getGreeting()
    {
        return studentRepository.findAll();
    }


    public void addnewStudent(Student student) {
        Optional<Student> studentbyEmail =  studentRepository.findStudentByEmail(student.getEmail());
        if(studentbyEmail.isPresent())
        {
            throw new IllegalStateException("email already present");
        }
        System.out.println(student);
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists)
        {
            throw new IllegalStateException("student doesn't exist");
        }
        studentRepository.deleteById(studentId);

    }
}
