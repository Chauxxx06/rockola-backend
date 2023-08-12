package com.rockola.api.service.impl;

import com.rockola.api.entity.CancionArtista;
import com.rockola.api.repository.CancionArtistaRepository;
import com.rockola.api.repository.GenericRepository;
import com.rockola.api.service.CancionArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancionArtistaServiceImpl extends CRUDImpl<CancionArtista, Integer> implements CancionArtistaService {

    @Autowired
    private CancionArtistaRepository repository;

    @Override
    protected GenericRepository<CancionArtista, Integer> getRepository() { return repository; }
}
