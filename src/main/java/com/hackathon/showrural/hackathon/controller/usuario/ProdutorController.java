package com.hackathon.showrural.hackathon.controller.usuario;

import com.hackathon.showrural.hackathon.domain.usuario.Produtor;
import com.hackathon.showrural.hackathon.service.usuario.ProdutorService;
import com.hackathon.showrural.hackathon.controller.usuario.requests.ProdutorRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("produtor")
public class ProdutorController {
    final ProdutorService produtorService;

    @PostMapping("/create")
    public ResponseEntity<Produtor> create(@Valid @RequestBody ProdutorRequest request){
        return new ResponseEntity<>(produtorService.createUser(request), HttpStatus.CREATED);
    }
}
