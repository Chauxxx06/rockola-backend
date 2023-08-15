package com.rockola.api.repository;

import com.rockola.api.entity.Cancion;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionRepository extends GenericRepository<Cancion, Integer>{
}
