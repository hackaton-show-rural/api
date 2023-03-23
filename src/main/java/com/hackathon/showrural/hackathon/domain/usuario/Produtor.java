package com.hackathon.showrural.hackathon.domain.usuario;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class Produtor extends Persistable {
    @NotNull
    private boolean primeiroProdutor;
    @NotNull
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Usuario usuario;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aplicador> aplicadores;
}
