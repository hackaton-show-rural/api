package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TipoAplicacao extends Persistable {
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private ColetaIdeal coletaIdeal;


}
