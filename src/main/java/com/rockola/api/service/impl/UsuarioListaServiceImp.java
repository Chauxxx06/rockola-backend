package com.rockola.api.service.impl;

import com.rockola.api.entity.UsuarioLista;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.UsuarioListaRepository;
import com.rockola.api.service.UsuarioListaService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioListaServiceImp extends CRUDImpl<UsuarioLista, Integer> implements UsuarioListaService {

    @Autowired
    private UsuarioListaRepository repository;

    @Override
    protected GenericRepository<UsuarioLista, Integer> getRepository() { return repository; }
}
