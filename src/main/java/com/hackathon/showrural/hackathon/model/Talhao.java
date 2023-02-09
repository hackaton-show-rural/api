package com.hackathon.showrural.hackathon.model;

import com.hackathon.showrural.hackathon.Persistable;
import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Talhao extends Persistable {
    private String nome;
    private String longitude;
    private String latitude;
}
