package com.hackathon.showrural.hackathon.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
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
