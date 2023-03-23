package com.hackathon.showrural.hackathon.controller.coleta;

import com.fasterxml.jackson.core.JsonParser;
import com.hackathon.showrural.hackathon.domain.ContextoUsuario;
import com.hackathon.showrural.hackathon.domain.coleta.Coleta;
import com.hackathon.showrural.hackathon.service.coleta.ColetaService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Api(value = "Coleta")
@RequiredArgsConstructor
@RestController
@RequestMapping("/coleta")
public class ColetaController {
    final ColetaService coletaService;
    final ContextoUsuario contextoUsuario;

    @GetMapping
    public ResponseEntity<List<Coleta>> getAll(){
        return ResponseEntity.ok(coletaService.getAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Coleta> getById(@PathVariable Long id){
        return ResponseEntity.ok(coletaService.getById(id));
    }
    @PostMapping("/save")
    public Coleta save(@RequestBody Coleta coleta){
        return coletaService.save(coleta);
    }
    @PostMapping("/finalSave")
    public void finalizarColeta(@RequestBody Long id){
        coletaService.finalSave(id);
    }

    @GetMapping("/get")
    public String getColeta() throws ParseException {
        String url = "https://api.openweathermap.org/data/3.0/onecall?lat=4.5&lon=5.5&exclude=minutely,hourly,daily&appid=bc54e25619ce3cce4c597311a6e8a835&lang=pt_br&units=metric";
        RestTemplate template = new RestTemplate();
        String response = template.getForObject(url, String.class);
        return response;
    }
}
