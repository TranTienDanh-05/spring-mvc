package com.example.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContreller {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot! danh";
    }

}
