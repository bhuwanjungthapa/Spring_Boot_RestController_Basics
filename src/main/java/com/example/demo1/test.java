package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {

    private int count = 0;

    @GetMapping("/testing")
    public String hello() {
        System.out.println("Hello World " + count);
        return "Hello-World " + count;
    }
    @GetMapping("/increase-count")
    public String increaseCount() {
        count++;
        return "Count increased: " + count;
    }

}
