package com.example.JPAdemo.service;

import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo ;

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
    public void addStudent(List<Student> students){
        studentRepo.saveAll(students);
    }

    public Student getStudentById(int rollno) {
        return studentRepo.findById(rollno).orElse(new Student());
    }

    public void updateStudent(Student student) {
         studentRepo.save(student);
    }

    public void deleteByNo(int rno) {
        studentRepo.deleteById(rno);
    }

    public void clearAll() {
        studentRepo.deleteAll();
    }

    public List<Student> getStudentBytech(String tech) {
        return studentRepo.findByTech(tech);
    }
}
