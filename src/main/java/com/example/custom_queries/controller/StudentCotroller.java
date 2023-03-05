package com.example.custom_queries.controller;


import com.example.custom_queries.model.Student;
import com.example.custom_queries.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCotroller {

    @Autowired
    StudentService studentService;

    @PostMapping("savestudent")
    public ResponseEntity savestudent(@RequestBody Student student){
             studentService.saveStudent(student);

             return new ResponseEntity("studentdave", HttpStatus.CREATED);
    }

    @GetMapping("getStudent")
    public List<Student> getstudent(@RequestParam boolean active){//@Nullable @RequestParam Integer age @Nullable @RequestParam String firstName, //@Nullable @RequestParam String lastName
        return studentService.getstudent(active);
    }
}
