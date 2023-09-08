package com.rockola.api.repository;

import com.rockola.api.entity.Cancion;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends GenericRepository<Cancion, Integer>{
    @Query(value= "SELECT * FROM cancion WHERE id_genero = :idGenero", nativeQuery = true)
    List<Cancion> findCancion(Integer idGenero);
}
