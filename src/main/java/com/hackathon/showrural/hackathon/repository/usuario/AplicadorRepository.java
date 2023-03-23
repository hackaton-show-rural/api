package com.hackathon.showrural.hackathon.repository.usuario;

import com.hackathon.showrural.hackathon.domain.usuario.Aplicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AplicadorRepository extends JpaRepository<Aplicador, Long> {
}
