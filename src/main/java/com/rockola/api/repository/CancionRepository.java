package com.rockola.api.repository;

import com.rockola.api.entity.Cancion;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends GenericRepository<Cancion, Integer>{
    @Query(value= "SELECT CA.tipo_genero, CA.id_genero FROM CANCION C JOIN GENERO_MUSICAL CA ON C.id_genero = CA.id_genero WHERE ID_GENERO = :idGenero", nativeQuery = true)
    Cancion findCancion(@Param("idGenero") Integer idGenero);
}
