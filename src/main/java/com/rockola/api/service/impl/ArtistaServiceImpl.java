package com.rockola.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockola.api.entity.Artista;
import com.rockola.api.repository.ArtistaRepository;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.service.ArtistaService;

@Service
public class ArtistaServiceImpl extends CRUDImpl<Artista, Integer> implements ArtistaService{
    @Autowired
    private ArtistaRepository repository;

    @Override
    protected GenericRepository<Artista, Integer> getRepository() { return repository; }
}
