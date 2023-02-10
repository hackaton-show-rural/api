package com.hackathon.showrural.hackathon.model;

import lombok.Data;

import java.util.List;

@Data
public class TalhaoData {
    private Talhao talhao;
    private List<Coleta> coletas;
    private Coleta ultimaColeta;
}
