package com.rockola.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rockola.api.entity.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer>{
    @Query(value= "SELECT * FROM usuario WHERE nickname = :nickname", nativeQuery = true)
    Usuario findUser(@Param("nickname") String nickname);
}
