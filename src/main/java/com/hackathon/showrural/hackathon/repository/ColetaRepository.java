package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.Talhao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColetaRepository extends JpaRepository<Coleta, Long> {
    List<Coleta> findAllByTalhaoId(Long id);
}
