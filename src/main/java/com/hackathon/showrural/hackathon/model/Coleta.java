package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Coleta  extends Persistable {
    private LocalDateTime data;
    private double temperaturaAtual;
    private double umidadeRelativa;
    private double velVento;
    private boolean chuva;
    private double proximaChuva;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    @OneToOne(cascade = CascadeType.ALL)
    private TipoAplicacao tipoAplicacao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;
    private boolean hasChanged;
}
