package com.example.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringappApplicationTests {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setStudentId(1);
        student.setFirstName("Rahul");
        student.setLastName("Sharma");
        return student;
    }
}
