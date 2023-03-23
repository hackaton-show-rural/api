package com.hackathon.showrural.hackathon.service.coleta;

import com.hackathon.showrural.hackathon.domain.coleta.TipoAplicacao;
import com.hackathon.showrural.hackathon.repository.coleta.TipoAplicacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoAplicacaoService {

    @Autowired
    TipoAplicacaoRepository tipoAplicacaoRepository;

    public List<TipoAplicacao> getAll() {
        return tipoAplicacaoRepository.findAll();
    }
    public TipoAplicacao getById(Long id) {
        Optional<TipoAplicacao> tipoAplicacao = tipoAplicacaoRepository.findById(id);
        return tipoAplicacao.orElse(null);
    }

    public TipoAplicacao delete(Long id){
        TipoAplicacao tipoAplicacao = getById(id);
        if(tipoAplicacao != null) tipoAplicacaoRepository.delete(tipoAplicacao);
        return tipoAplicacao;
    }
    public TipoAplicacao save(TipoAplicacao tipoAplicacao){
        try{
            System.out.println(tipoAplicacao);
            tipoAplicacaoRepository.save(tipoAplicacao);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return tipoAplicacao;
    }
}
