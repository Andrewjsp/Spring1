package com.epam.controller;

import com.epam.dto.TokenDto;
import com.epam.forms.LoginForm;
import com.epam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginForm loginForm){
    return ResponseEntity.ok(loginService.login(loginForm));
}
}
