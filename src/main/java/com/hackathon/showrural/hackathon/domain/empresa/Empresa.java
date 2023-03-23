package com.hackathon.showrural.hackathon.domain.empresa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hackathon.showrural.hackathon.Persistable;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Empresa extends Persistable {
    @Column
    @NotNull(message = "O campo [Nome] deve ser informado em Empresa")
    private String nome;
    private boolean ativo = true;
    @JsonIgnoreProperties("empresa")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "empresa")
    private List<Usuario> usuarios;
}
