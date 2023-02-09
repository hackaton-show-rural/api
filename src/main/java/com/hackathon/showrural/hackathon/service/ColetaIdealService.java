package com.hackathon.showrural.hackathon.service;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.ColetaIdeal;
import com.hackathon.showrural.hackathon.repository.ColetaIdealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColetaIdealService {
    @Autowired
    ColetaIdealRepository coletaIdealRepository;

    public List<ColetaIdeal> getAll(){
        return coletaIdealRepository.findAll();
    }
}
