package com.hackathon.showrural.hackathon.controller;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.TipoAplicacao;
import com.hackathon.showrural.hackathon.repository.ColetaRepository;
import com.hackathon.showrural.hackathon.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/coleta")
public class ColetaController {
    @Autowired
    ColetaService coletaService;


    @GetMapping("/")
    public ResponseEntity<List<Coleta>> getAll(){
        return ResponseEntity.ok(coletaService.getAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Coleta> getById(@PathVariable Long id){
        return ResponseEntity.ok(coletaService.getById(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Coleta> save(@RequestBody Coleta coleta){
        return ResponseEntity.ok(coletaService.save(coleta));
    }
}
