package com.example.JPAdemo.controller;

import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{rno}")
    public Student getStudentById(@PathVariable ("rno") int rno ){
        return studentService.getStudentById(rno);
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody List<Student> students) // jackson converts json to java obj. we have to receive as java obj
    {
        studentService.addStudent(students);
        return "added";
    }
    @PostMapping("/students/sivaraj")
    public Student addStudent(@Valid  @RequestBody Student students) // jackson converts json to java obj. we have to receive as java obj
    {
        return students;
    }

    @PutMapping("/students")
    public String updatestudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "updated";
    }

    @DeleteMapping("/students/{rno}")
     public String deleteaByNo(@PathVariable int rno){
        studentService.deleteByNo(rno);
        return "deleted";
    }

    @DeleteMapping("/students/clear")
    public String deleteALL(){
        studentService.clearAll();
        return "deleted all records";
    }

    @GetMapping("students/tech/{tech}")
    public List<Student> getStudentByTech(@PathVariable String tech){
       return studentService.getStudentBytech(tech);
    }

}

