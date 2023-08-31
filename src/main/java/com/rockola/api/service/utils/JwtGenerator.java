package com.rockola.api.service.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import org.springframework.stereotype.Component;


@Component
public class JwtGenerator {

    public String jwtOutput() {
        String secretKey = "miClaveSecreta"; // Clave secreta para firmar el token
        String subject = "usuario123"; // Sujeto del token
        long expirationTimeMillis = System.currentTimeMillis() + 3600000; // Expiración en una hora

        String token = Jwts.builder()
                .setSubject(subject)
                .setExpiration(new Date(expirationTimeMillis))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
        System.out.println(token);
        return token;
    }
}
