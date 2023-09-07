package com.rockola.api.service.impl;

import com.rockola.api.entity.Cancion;
import com.rockola.api.repository.CancionRepository;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.service.CancionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancionServiceImpl extends CRUDImpl<Cancion, Integer> implements CancionService {

    @Autowired
    private CancionRepository repository;
    @Override
    protected GenericRepository<Cancion, Integer> getRepository() { return repository; }

   public Cancion findCancion(Integer idGenero){
        return repository.findCancion(idGenero);
    }

}
