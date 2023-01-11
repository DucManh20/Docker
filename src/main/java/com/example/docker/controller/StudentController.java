package com.example.docker.controller;

import com.example.docker.model.Students;
import com.example.docker.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/hello")
    //http://localhost:8083/students/hello
    @ResponseBody
    public String hello(){
        return "hello world. Manh?Hehe";
    }

    @PostMapping("/add")
    //http://localhost:8083/students/add
    public String add(@ModelAttribute Students students){
        try{
            studentRepository.save(students);
            return "Insert Successfully!";
        }catch (Exception e){
            return "insert failed";
        }
    }

    @GetMapping("/findAll")
    //http://localhost:8083/students/findAll
    public List<Students> findAll(){
            return studentRepository.findAll();
    }
}
