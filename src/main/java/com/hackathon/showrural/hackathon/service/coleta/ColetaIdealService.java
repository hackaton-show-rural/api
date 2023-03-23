package com.hackathon.showrural.hackathon.service.coleta;

import com.hackathon.showrural.hackathon.domain.coleta.ColetaIdeal;
import com.hackathon.showrural.hackathon.repository.coleta.ColetaIdealRepository;
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
