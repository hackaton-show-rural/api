package com.hackathon.showrural.hackathon.service;

import com.hackathon.showrural.hackathon.model.Talhao;
import com.hackathon.showrural.hackathon.model.Talhao;
import com.hackathon.showrural.hackathon.repository.TalhaoRepository;
import com.hackathon.showrural.hackathon.repository.TalhaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TalhaoService {
    @Autowired
    TalhaoRepository talhaoRepository;

    public List<Talhao> getAll() {
        return talhaoRepository.findAll();
    }
    public Talhao getById(Long id) {
        Optional<Talhao> talhao = talhaoRepository.findById(id);
        return talhao.orElse(null);
    }

    public Talhao delete(Long id){
        Talhao talhao = getById(id);
        if(talhao != null) talhaoRepository.delete(talhao);
        return talhao;
    }
    public Talhao save(Talhao talhao){
        try{
            talhaoRepository.save(talhao);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return talhao;
    }
}
