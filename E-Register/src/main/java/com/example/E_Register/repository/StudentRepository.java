package com.example.E_Register.repository;

import com.example.E_Register.entity.Student;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ListCrudRepository<Student, Long> {
}
