package com.hackathon.showrural.hackathon.repository.usuario;

import com.hackathon.showrural.hackathon.domain.usuario.Produtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutorRepository extends JpaRepository<Produtor, Long> {
}
