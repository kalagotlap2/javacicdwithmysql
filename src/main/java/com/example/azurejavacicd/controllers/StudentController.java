package com.example.azurejavacicd.controllers;


import com.example.azurejavacicd.model.Student;
import com.example.azurejavacicd.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/all")
    public List<Student> getAllUsers(){
        return  this.studentService.getAllUsers();
    }

    @PostMapping("/add")
    public Student addNewUser(@RequestBody Student student){
      return this.studentService.addNewUser(student);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Integer id){
        this.studentService.deleteStudent(id);
    }
}
