package com.hackathon.showrural.hackathon.domain.talhao;

import com.hackathon.showrural.hackathon.domain.coleta.Coleta;
import lombok.Data;

import java.util.List;

@Data
public class TalhaoData {
    private Talhao talhao;
    private List<Coleta> coletas;
    private Coleta ultimaColeta;
}
