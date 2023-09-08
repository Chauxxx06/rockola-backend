package com.rockola.api.service;

import java.util.List;

import com.rockola.api.entity.Cancion;

public interface CancionService extends CRUD<Cancion, Integer> {
     List<Cancion> findCancion(Integer idGenero);
    
}
