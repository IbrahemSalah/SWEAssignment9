package com.example.E_Register.controller;


import com.example.E_Register.entity.Student;
import com.example.E_Register.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    final private StudentService studentService;

    @PostMapping
    public void saveStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }


    @PutMapping
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }
}
