package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


@RestController
@RequestMapping("/api")
public class Api_Test {
    @GetMapping("/users")
    public List<String> getAllUsers() {
        return List.of("Alice", "Bob", "Charlie");
    }

    @PostMapping("/users")
    public String createUser(@RequestBody String userName) {
        return "User " + userName + " created successfully!";
    }

    @GetMapping("/hello/{name}")
    public String greetUser(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "index";
    }
}
