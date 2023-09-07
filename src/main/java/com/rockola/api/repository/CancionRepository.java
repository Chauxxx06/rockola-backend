package com.rockola.api.repository;

import com.rockola.api.entity.Cancion;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends GenericRepository<Cancion, Integer>{
    @Query(value= "SELECT nombre_cancion,descripcion_cancion,imagen_cancion  FROM CANCION C WHERE C.ID_GENERO = :idGenero", nativeQuery = true)
    Cancion findCancion(@Param("idGenero") Integer idGenero);
}
