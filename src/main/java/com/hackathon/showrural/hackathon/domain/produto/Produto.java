package com.hackathon.showrural.hackathon.domain.produto;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto extends Persistable {
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name = "unidade_medida")
    private UnidadeMedida unidadeMedida;
    private double dosagem;
}
