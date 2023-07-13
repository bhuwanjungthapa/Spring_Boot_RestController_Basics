package com.example.demo1;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemController {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello World!";
    }
}
