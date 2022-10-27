package com.example.demo_with_maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController{
        @GetMapping("/employees/{empid}/{name}/{sal}")
    public Employee emp(@PathVariable("empid")int empid,@PathVariable("name")String name,@PathVariable("sal")int sal){
        return new Employee(empid,name,sal);
    }
    @GetMapping("/employees/api")
    public Employee emp1(@RequestParam(name="empid")int empid,@RequestParam(name="name")String name,@RequestParam(name="sal")int sal){
        return new Employee(empid,name,sal);

    }
}
