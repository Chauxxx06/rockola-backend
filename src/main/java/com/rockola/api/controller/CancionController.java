package com.rockola.api.controller;

import com.rockola.api.entity.Cancion;
import com.rockola.api.service.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cancion")
public class CancionController {

    @Autowired
    private CancionService service;

    @PostMapping("/save")
    public ResponseEntity<Cancion> register(@RequestBody Cancion cancion){
        return new ResponseEntity<Cancion>(service.register(cancion), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Cancion>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<Cancion> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Cancion> update(@RequestBody Cancion cancion){

        if (service.getById(cancion.getIdCancion())!= null) {
            return new ResponseEntity<Cancion>(service.register(cancion),HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
