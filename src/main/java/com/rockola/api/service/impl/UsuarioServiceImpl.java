package com.rockola.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockola.api.entity.Usuario;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.repository.UsuarioRepository;
import com.rockola.api.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends CRUDImpl<Usuario, Integer> implements UsuarioService{
     @Autowired
    private UsuarioRepository repository;

    @Override
    protected GenericRepository<Usuario, Integer> getRepository() { return repository; }
}
