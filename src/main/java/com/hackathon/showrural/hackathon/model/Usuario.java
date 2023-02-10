package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Usuario extends Persistable {
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private TipoUsuario tipoUsuario;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Talhao> talhoes;
}
