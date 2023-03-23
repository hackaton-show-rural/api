package com.hackathon.showrural.hackathon.controller.empresa;

import com.hackathon.showrural.hackathon.domain.empresa.Empresa;
import com.hackathon.showrural.hackathon.service.empresa.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("empresa")
@RestController
public class EmpresaController {
    final EmpresaService empresaService;
    @GetMapping
    public ResponseEntity<List<Empresa>> getAll(){
        return new ResponseEntity<>(empresaService.getAll(), HttpStatus.OK);
    }
}
