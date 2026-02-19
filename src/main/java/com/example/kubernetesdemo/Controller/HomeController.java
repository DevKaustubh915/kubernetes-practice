package com.example.kubernetesdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName() {
        return "Hello from Spring Boot! You sent: ";
    }
    
    
}
