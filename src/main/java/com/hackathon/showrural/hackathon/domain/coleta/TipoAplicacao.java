package com.hackathon.showrural.hackathon.domain.coleta;

import com.hackathon.showrural.hackathon.Persistable;
import com.hackathon.showrural.hackathon.domain.coleta.ColetaIdeal;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TipoAplicacao extends Persistable {
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private ColetaIdeal coletaIdeal;


}
