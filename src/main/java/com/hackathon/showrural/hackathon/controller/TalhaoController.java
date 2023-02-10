package com.hackathon.showrural.hackathon.controller;


import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.Talhao;
import com.hackathon.showrural.hackathon.model.TalhaoData;
import com.hackathon.showrural.hackathon.repository.TalhaoRepository;
import com.hackathon.showrural.hackathon.service.ColetaService;
import com.hackathon.showrural.hackathon.service.TalhaoDataService;
import com.hackathon.showrural.hackathon.service.TalhaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/talhao")
public class TalhaoController{
    @Autowired
    TalhaoService talhaoService;

    @Autowired
    TalhaoDataService talhaoDataService;

    @GetMapping("/")
    public ResponseEntity<List<Talhao>> getAll(){
        return ResponseEntity.ok(talhaoService.getAll());
    }

    @PostMapping("/")
    public ResponseEntity<Talhao> save(@RequestBody Talhao talhao){
        return ResponseEntity.ok(talhaoService.save(talhao));
    }

    @GetMapping("/{id}")
    public TalhaoData talhaoData(@PathVariable Long id){
        return talhaoDataService.getTalhaoData(id);
    }
}
