package com.example.custom_queries.service;


import com.example.custom_queries.dao.IStudentRepository;
import com.example.custom_queries.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepository;

            public void saveStudent(Student student){
                     studentRepository.save(student);
            }

    public List<Student> getstudent(boolean active) {// List<Integer> ages  Integer age  String firstName,//String lastName
        //Student student=studentRepository.findByFirstName(firstName);
        //Student student=studentRepository.findByFirstNameAndLastName( firstName, lastName);
        //Student student=new Student();
//        if(firstName==null || lastName==null) {
//             student = studentRepository.findByFirstNameOrLastName(firstName, lastName);
//        }
//        student=studentRepository.findByAgeGreaterThan( age);

        //student=studentRepository.findByAgeGreaterThanEqual( age);
       // student=studentRepository.findByAgeLessThan(age);
        //student=studentRepository.findByAgeLessThanEqual( age);
       //student=studentRepository.findByFirstNameLike();
//        List<Student> student=studentRepository.findByFirstNameNotLike();
//        List<Student> student=studentRepository.findByfirstNameEndingWith();
//        List<Student> student=studentRepository.findByfirstNameContaining();
        //List<Student> student=studentRepository.findByAgeOrderByFirstName(age);
        //List<Student> student=studentRepository.findByFirstNameNot();
//        List<Student> student=studentRepository.findByFirstNameNot();
        //List<Student> student=studentRepository.findByAgeIn(ages);

        List<Student> student=studentRepository.findByActive(active);
        return student;
    }
}
