package com.hackathon.showrural.hackathon.domain.talhao;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Talhao extends Persistable {
    private String nome;
    private double longitude;
    private double latitude;
}
