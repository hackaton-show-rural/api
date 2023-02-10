package com.hackathon.showrural.hackathon.controller;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.service.ColetaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Api(value = "Coleta")
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
    @PostMapping("/finalSave")
    public void finalizarColeta(@RequestBody Long id){
        coletaService.finalSave(id);
    }
}
