package com.rockola.api.repository;

import org.springframework.stereotype.Repository;

import com.rockola.api.entity.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer>{
    
}
