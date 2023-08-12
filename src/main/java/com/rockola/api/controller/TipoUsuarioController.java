package com.rockola.api.controller;

import com.rockola.api.entity.TipoUsuario;
import com.rockola.api.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipo-usuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService service;

    @PostMapping("/save")
    public ResponseEntity<TipoUsuario> register(@RequestBody TipoUsuario tipoUsuario)
    {
        return new ResponseEntity<TipoUsuario>(service.register(tipoUsuario), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<TipoUsuario>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<TipoUsuario> getById(@PathVariable("identificador") Integer id){
        return ResponseEntity.ok(service.getById(id));
    }


    @PutMapping("/update")
    public ResponseEntity<TipoUsuario> update(@RequestBody TipoUsuario tipoUsuario){
        if (service.getById(tipoUsuario.getIdTipoUsuario())!= null) {
            return new ResponseEntity<TipoUsuario>(service.register(tipoUsuario), HttpStatus.CREATED);
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
