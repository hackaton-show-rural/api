package com.hackathon.showrural.hackathon.controller;

import com.hackathon.showrural.hackathon.model.TipoAplicacao;
import com.hackathon.showrural.hackathon.service.TipoAplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipoAplicacao")
public class TipoAplicacaoController {

    @Autowired
    TipoAplicacaoService tipoAplicacaoService;

    @GetMapping("/")
    public ResponseEntity<List<TipoAplicacao>> getAll(){
        return ResponseEntity.ok(tipoAplicacaoService.getAll());
    }
    @PostMapping("/")
    public ResponseEntity<TipoAplicacao> save(@RequestBody TipoAplicacao tipoAplicacao){
        return ResponseEntity.ok(tipoAplicacaoService.save(tipoAplicacao));
    }

}
