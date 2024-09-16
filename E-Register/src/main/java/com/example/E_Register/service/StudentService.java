package com.example.E_Register.service;

import com.example.E_Register.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    List<Student> getAllStudent();

}
