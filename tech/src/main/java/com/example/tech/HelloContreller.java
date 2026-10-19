package com.example.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContreller {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot! danh update";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access this page";
    }
}
