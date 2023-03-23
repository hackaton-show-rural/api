package com.hackathon.showrural.hackathon.service.talhao;

import com.hackathon.showrural.hackathon.domain.coleta.Coleta;
import com.hackathon.showrural.hackathon.domain.talhao.TalhaoData;
import com.hackathon.showrural.hackathon.service.coleta.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalhaoDataService {
    @Autowired
    TalhaoService talhaoService;
    @Autowired
    ColetaService coletaService;

    public TalhaoData getTalhaoData(Long id) {
        TalhaoData talhaoData = new TalhaoData();
        talhaoData.setTalhao(talhaoService.getById(id));
        List<Coleta> coletasByTalhao = coletaService.findAllByTalhaoId(id);
        talhaoData.setColetas(coletasByTalhao);
        talhaoData.setUltimaColeta(coletaService.getLast(coletasByTalhao));

        return talhaoData;
    }
}
