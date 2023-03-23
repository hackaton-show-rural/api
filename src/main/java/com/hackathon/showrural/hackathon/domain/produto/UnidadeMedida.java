package com.hackathon.showrural.hackathon.domain.produto;

import com.hackathon.showrural.hackathon.Persistable;

public enum UnidadeMedida{
    LITROS_POR_HECTARE("l/ha", 1);

    private String nome;
    private Integer valor;
    UnidadeMedida(String nome, Integer valor)
    {
        this.nome = nome;
        this.valor = valor;
    }

    public String toString()
    {
        return this.nome;
    }
}
