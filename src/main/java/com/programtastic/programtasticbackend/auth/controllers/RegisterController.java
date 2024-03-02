package com.programtastic.programtasticbackend.auth.controllers;

import com.programtastic.programtasticbackend.auth.requests.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class RegisterController {

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest) {}
}
