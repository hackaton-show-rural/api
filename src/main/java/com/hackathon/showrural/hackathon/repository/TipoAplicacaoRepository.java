package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.TipoAplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAplicacaoRepository extends JpaRepository<TipoAplicacao, Long> {
}
