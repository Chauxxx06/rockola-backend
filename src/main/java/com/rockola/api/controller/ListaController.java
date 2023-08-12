package com.rockola.api.controller;


import com.rockola.api.entity.Lista;
import com.rockola.api.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lista")
public class ListaController {

    @Autowired
    private ListaService service;

    @PostMapping("/save")
    public ResponseEntity<Lista> register(@RequestBody Lista lista)
    {
        return new ResponseEntity<Lista>(service.register(lista), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Lista>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<Lista> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Lista> update(@RequestBody Lista lista){
        return new ResponseEntity<Lista>(service.register(lista),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
