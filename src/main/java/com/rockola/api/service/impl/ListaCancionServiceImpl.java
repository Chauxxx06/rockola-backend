package com.rockola.api.service.impl;

import com.rockola.api.entity.ListaCancion;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.ListaCancionRepository;
import com.rockola.api.service.ListaCancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaCancionServiceImpl extends CRUDImpl<ListaCancion, Integer> implements ListaCancionService {

    @Autowired
    private ListaCancionRepository repository;

    @Override
    protected GenericRepository<ListaCancion, Integer> getRepository() { return repository; }
}
