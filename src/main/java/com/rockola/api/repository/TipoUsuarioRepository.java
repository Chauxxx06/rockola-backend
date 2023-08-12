package com.rockola.api.repository;

import com.rockola.api.entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends GenericRepository<TipoUsuario, Integer> {
}
