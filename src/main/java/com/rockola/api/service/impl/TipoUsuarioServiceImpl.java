package com.rockola.api.service.impl;

import com.rockola.api.entity.TipoUsuario;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.TipoUsuarioRepository;
import com.rockola.api.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioServiceImpl extends CRUDImpl<TipoUsuario, Integer> implements TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository repository;

    @Override
    protected GenericRepository<TipoUsuario, Integer> getRepository() {return repository;}
}
