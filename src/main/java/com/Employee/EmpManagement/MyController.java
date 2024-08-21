package com.Employee.EmpManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("test")
    public static String Test(){
        return "Shivkumar";
    }
}
