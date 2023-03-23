package com.hackathon.showrural.hackathon.controller.talhao;


import com.hackathon.showrural.hackathon.domain.talhao.Talhao;
import com.hackathon.showrural.hackathon.domain.talhao.TalhaoData;
import com.hackathon.showrural.hackathon.service.talhao.TalhaoDataService;
import com.hackathon.showrural.hackathon.service.talhao.TalhaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/talhao")
@RequiredArgsConstructor
@CrossOrigin
public class TalhaoController{

    final TalhaoService talhaoService;

    final TalhaoDataService talhaoDataService;

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
