package com.hackathon.showrural.hackathon.controller.usuario;

import com.hackathon.showrural.hackathon.controller.usuario.requests.AplicadorRequest;
import com.hackathon.showrural.hackathon.domain.ContextoUsuario;
import com.hackathon.showrural.hackathon.domain.usuario.Aplicador;
import com.hackathon.showrural.hackathon.service.usuario.AplicadorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("aplicador")
public class AplicadorController {
    final AplicadorService aplicadorService;
    @PostMapping("/create")
    public ResponseEntity<Aplicador> create(@Valid @RequestBody AplicadorRequest request){
        return new ResponseEntity<>(aplicadorService.createUser(request), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Aplicador>> getAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextoUsuario.class);
        ContextoUsuario contextoUsuario = context.getBean(ContextoUsuario.class);
        System.out.println(contextoUsuario);
        return new ResponseEntity<>(aplicadorService.getAll(), HttpStatus.OK);
    }
}
