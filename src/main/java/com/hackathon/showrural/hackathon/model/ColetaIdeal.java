package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ColetaIdeal extends Persistable {
    private double temperaturaMinima;
    private double temperaturaIdeal;
    private double temperaturaMaxima;
    private double umidadeRelativaMinima;
    private double umidadeRelativaIdealMinima;
    private double umidadeRelativaIdealMaxima;
    private double umidadeRelativaMaxima;
    private double velocidadeVentoMinima;
    private double velocidadeVentoMaxima;
    private boolean chuva;
    private double proximaChuvaMin;
}
