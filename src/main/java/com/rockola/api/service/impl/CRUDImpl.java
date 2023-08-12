package com.rockola.api.service.impl;


import com.rockola.api.repository.GenericRepository;
import com.rockola.api.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements CRUD<T, ID> {

    @Autowired
    protected abstract GenericRepository<T, ID> getRepository();

    @Override
    public T register(T t){return getRepository().save(t);}

    @Override
    public List<T> getAll() {
        return getRepository().findAll();
    }

    @Override
    public T update(T t) {
        return getRepository().save(t);
    }

    @Override
    public T getById(ID id) {
        return getRepository().findById(id)
                .orElseThrow(() -> new RuntimeException("ID NO ENCONTRADO " + id));
    }

    @Override
    public void delete(ID id) {
        getById(id);
        getRepository().deleteById(id);
    }
}
