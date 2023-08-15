package com.rockola.api.controller;


import com.rockola.api.entity.UsuarioLista;
import com.rockola.api.service.UsuarioListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("usuario-lista")
public class UsuarioListaController {

    @Autowired
    private UsuarioListaService service;

    @PostMapping("/save")
    public ResponseEntity<UsuarioLista> register(@RequestBody UsuarioLista usuarioLista)
    {
        return new ResponseEntity<UsuarioLista>(service.register(usuarioLista), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<UsuarioLista>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<UsuarioLista> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<UsuarioLista> update(@RequestBody UsuarioLista usuarioLista){
        return new ResponseEntity<UsuarioLista>(service.register(usuarioLista),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
