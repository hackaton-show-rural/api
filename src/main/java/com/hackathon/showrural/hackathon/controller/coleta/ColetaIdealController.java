package com.hackathon.showrural.hackathon.controller.coleta;

import com.hackathon.showrural.hackathon.domain.coleta.ColetaIdeal;
import com.hackathon.showrural.hackathon.service.coleta.ColetaIdealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("coletaIdeal")
public class ColetaIdealController {
    @Autowired
    ColetaIdealService coletaIdealService;

    @GetMapping("/")
    public ResponseEntity<List<ColetaIdeal>> getAll(){
        return ResponseEntity.ok(coletaIdealService.getAll());
    }
}
