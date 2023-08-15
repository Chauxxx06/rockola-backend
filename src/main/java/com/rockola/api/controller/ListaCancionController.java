package com.rockola.api.controller;

//import com.rockola.api.entity.CancionArtista;
import com.rockola.api.entity.ListaCancion;
import com.rockola.api.service.ListaCancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lista-cancion")
public class ListaCancionController {

    @Autowired
    private ListaCancionService service;


    @PostMapping("/save")
    public ResponseEntity<ListaCancion> register(@RequestBody ListaCancion listaCancion)
    {
        return new ResponseEntity<ListaCancion>(service.register(listaCancion), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<ListaCancion>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<ListaCancion> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ListaCancion> update(@RequestBody ListaCancion listaCancion){
        return new ResponseEntity<ListaCancion>(service.register(listaCancion),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
