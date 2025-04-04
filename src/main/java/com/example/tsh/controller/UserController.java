package com.example.tsh.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/DENEME")
    public ResponseEntity<?>getDeneme(){
        return ResponseEntity.ok().body("deneme");
    }
}
