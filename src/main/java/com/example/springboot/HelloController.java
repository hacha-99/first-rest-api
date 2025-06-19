package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        String time = "";
        try {
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return time;
    }
}