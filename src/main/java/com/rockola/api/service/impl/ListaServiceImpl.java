package com.rockola.api.service.impl;

import com.rockola.api.entity.Lista;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.ListaRepository;
import com.rockola.api.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaServiceImpl extends CRUDImpl<Lista, Integer> implements ListaService {

    @Autowired
    private ListaRepository repository;

    @Override
    protected GenericRepository<Lista, Integer> getRepository(){ return repository; }
}
