package com.hackathon.showrural.hackathon.domain.produto;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class TipoUsuario extends Persistable{
    private String nome;
}
