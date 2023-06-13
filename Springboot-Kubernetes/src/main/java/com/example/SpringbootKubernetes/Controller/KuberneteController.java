package com.example.SpringbootKubernetes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuberneteController {
    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome sam";
    }
}