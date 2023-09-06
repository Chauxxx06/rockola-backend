package com.rockola.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockola.api.entity.dto.LoginDTO;
import com.rockola.api.entity.dto.UserDetailsDTO;
import com.rockola.api.entity.dto.ValidUserToken;
import com.rockola.api.service.impl.AuthServiceImpl;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    private AuthServiceImpl authService;

    @PostMapping("/login")
    public ResponseEntity<UserDetailsDTO> login(@RequestBody LoginDTO logindto){
        try {
            return ResponseEntity.ok(this.authService.Login(logindto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatusCode.valueOf(401)).build();
        }
    }

    @GetMapping("/valid/{id}")
    public ResponseEntity<ValidUserToken> validUser(@PathVariable("id") Integer id) {
        try {
            return ResponseEntity.ok(this.authService.validUser(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatusCode.valueOf(401)).build();
        }
    }
    
}
