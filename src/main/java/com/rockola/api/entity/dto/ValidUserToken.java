package com.rockola.api.entity.dto;

import lombok.Data;

@Data
public class ValidUserToken {
    private Integer idUsuario;
    private String token;
}
