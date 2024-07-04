package com.example.controller;

import com.example.StudentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Value("${app.name:default demo}")
    private String appName;

    @GetMapping("/get1")
    //@RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getStudent1(){
        return appName;
    }

    @GetMapping("/get")
    public StudentResponse getStudent(){
        StudentResponse studentResponse = new StudentResponse(1,"sarath", "nasika");
        return studentResponse;
    }
}
