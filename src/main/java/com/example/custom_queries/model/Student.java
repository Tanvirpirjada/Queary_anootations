package com.example.custom_queries.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_tbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String  lastName;

    private Integer age;

    private boolean active;
    private Date admissionDate;

}
