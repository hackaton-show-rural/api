package com.hackathon.showrural.hackathon.domain.usuario;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Aplicador extends Persistable {
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Usuario usuario;

}
