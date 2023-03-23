package com.hackathon.showrural.hackathon.domain.coleta;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hackathon.showrural.hackathon.Persistable;
import com.hackathon.showrural.hackathon.domain.produto.Produto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Coleta  extends Persistable {
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime data;
    private double temperaturaAtual;
    private double umidadeRelativa;
    private double velVento;
    private boolean chuva;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataInicio;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataFim;
    private Long tipoAplicacaoId;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;
    private boolean hasChanged;
    private Long talhaoId;
}
