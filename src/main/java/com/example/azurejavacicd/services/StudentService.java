package com.example.azurejavacicd.services;


import com.example.azurejavacicd.model.Student;
import com.example.azurejavacicd.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllUsers(){
        return  this.studentRepository.findAll();
    }

    public Student addNewUser(Student newStudent){
        System.out.println(newStudent);

         return this.studentRepository.save(newStudent);
    }

    public void deleteStudent(Integer id) {
        this.studentRepository.deleteById(id);
    }
}
