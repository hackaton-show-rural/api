package com.hackathon.showrural.hackathon.service.talhao;

import com.hackathon.showrural.hackathon.domain.talhao.Talhao;
import com.hackathon.showrural.hackathon.repository.talhao.TalhaoRepository;
import com.hackathon.showrural.hackathon.service.coleta.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TalhaoService {
    @Autowired
    TalhaoRepository talhaoRepository;
    @Autowired
    ColetaService coletaService;

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
