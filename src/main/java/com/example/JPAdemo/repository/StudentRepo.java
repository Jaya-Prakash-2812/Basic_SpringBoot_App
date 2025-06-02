package com.example.JPAdemo.repository;

import com.example.JPAdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findByTech(String tech);  // < entity_name , primary_key_data_type



}
