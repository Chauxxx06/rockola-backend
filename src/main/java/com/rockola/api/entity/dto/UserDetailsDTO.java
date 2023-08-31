package com.rockola.api.entity.dto;

import lombok.Data;

@Data
public class UserDetailsDTO {
    private Integer idUsuario;
    private Integer idTipoUsuario;
    private String nickname;
    private String token;
}
