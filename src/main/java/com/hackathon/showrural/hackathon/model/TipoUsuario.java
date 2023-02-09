package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.Entity;
import lombok.Data;

public enum TipoUsuario{
    PRODUTOR("Produtor", 1),
    APLICADOR("Aplicador", 2);

    private String nome;
    private Integer valor;
    TipoUsuario(String nome, Integer valor)
    {
        this.nome = nome;
        this.valor = valor;
    }

    public String toString()
    {
        return this.nome; //will return , or ' instead of COMMA or APOSTROPHE
    }
}
