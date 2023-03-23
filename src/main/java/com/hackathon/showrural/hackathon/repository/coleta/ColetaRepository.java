package com.hackathon.showrural.hackathon.repository.coleta;

import com.hackathon.showrural.hackathon.domain.coleta.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColetaRepository extends JpaRepository<Coleta, Long> {
    List<Coleta> findAllByTalhaoId(Long id);
}
