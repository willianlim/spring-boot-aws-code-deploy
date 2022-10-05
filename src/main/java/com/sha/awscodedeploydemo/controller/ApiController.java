package com.sha.awscodedeploydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("api/health")
    public ResponseEntity<String> healtCheck() {
        return ResponseEntity.ok("works successfully.");
    }
}


