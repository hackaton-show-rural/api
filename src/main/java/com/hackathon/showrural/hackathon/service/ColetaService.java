package com.hackathon.showrural.hackathon.service;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ColetaService {
    @Autowired
    ColetaRepository coletaRepository;
    @Autowired
    TipoAplicacaoService tipoAplicacaoService;

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
            coleta.setVelVento(coleta.getVelVento() * 3.6);
            coletaRepository.save(coleta);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return coleta;
    }
    public void finalSave(Long id) {
        try {
            Coleta coleta = getById(id);
            coleta.setDataFim(LocalDateTime.now());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        coletaRepository.flush();
    }
    public Coleta getLast(List<Coleta> coletas){
        if(coletas.isEmpty())
            return null;
        return coletas.get(coletas.size() - 1);
    }
    public List<Coleta> findAllByTalhaoId(Long id){
        return coletaRepository.findAllByTalhaoId(id);
    }
}