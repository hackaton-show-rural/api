package com.hackathon.showrural.hackathon.service;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.TipoAplicacao;
import com.hackathon.showrural.hackathon.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ColetaService {
    @Autowired
    ColetaRepository coletaRepository;

    public List<Coleta> getAll() {
        return coletaRepository.findAll();
    }
    public Coleta getById(Long id) {
        Optional<Coleta> coleta = coletaRepository.findById(id);
        return coleta.orElse(null);
    }

    public Coleta delete(Long id){
        Coleta coleta = getById(id);
        if(coleta != null) coletaRepository.delete(coleta);
        return coleta;
    }
    public Coleta save(Coleta coleta){
        try{
            System.out.println(coleta);
            coletaRepository.save(coleta);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return coleta;
    }

}