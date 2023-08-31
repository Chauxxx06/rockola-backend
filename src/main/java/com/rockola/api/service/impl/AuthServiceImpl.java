package com.rockola.api.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockola.api.entity.Usuario;
import com.rockola.api.entity.dto.LoginDTO;
import com.rockola.api.entity.dto.UserDetailsDTO;
import com.rockola.api.exception.PasswordNotMatchException;
import com.rockola.api.exception.UsuarioNotFoundException;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class AuthServiceImpl {
    
    @Autowired
    private UsuarioServiceImpl usuarioService;

    private String jwtOutput(String user) {
        String secretKey = "LaRockola.com"; // Clave secreta para firmar el token
        String subject = user; // Sujeto del token
        long expirationTimeMillis = System.currentTimeMillis() + 3600000; // Expiración en una hora

        String token = Jwts.builder()
                .setSubject(subject)
                .setExpiration(new Date(expirationTimeMillis))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
        return token;
    }


    public UserDetailsDTO Login(LoginDTO login){
        Usuario userDB = this.usuarioService.findUser(login.getNickname());
        if (userDB == null) {
            throw new UsuarioNotFoundException("Usuario No encontrado");
        }
        if (userDB.getPassword().equals(login.getPassword())){
            UserDetailsDTO userLogin = new UserDetailsDTO();
            userLogin.setIdUsuario(userDB.getIdUsuario());
            userLogin.setIdTipoUsuario(userDB.getIdTipoUsuario());
            userLogin.setNickname(userDB.getNickname());
            userLogin.setToken(this.jwtOutput(userDB.getNickname()));
            return userLogin;
        } else {
            throw new PasswordNotMatchException("Password no coincide");
        }

    }
}
