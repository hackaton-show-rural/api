package com.hackathon.showrural.hackathon.repository.coleta;

import com.hackathon.showrural.hackathon.domain.coleta.TipoAplicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAplicacaoRepository extends JpaRepository<TipoAplicacao, Long> {
}
