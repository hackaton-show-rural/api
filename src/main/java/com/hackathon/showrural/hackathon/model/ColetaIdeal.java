package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ColetaIdeal extends Persistable {
    private Integer temperaturaMinima;
    private Integer temperaturaIdeal;
    private Integer temperaturaMaxima;
    private Integer umidadeRelativaMinima;
    private Integer umidadeRelativaIdealMinima;
    private Integer umidadeRelativaIdealMaxima;
    private Integer umidadeRelativaMaxima;
    private Integer velocidadeVentoMinima;
    private Integer velocidadeVentoMaxima;
    private boolean chuva;
    private Integer proximaChuvaMin;
}
