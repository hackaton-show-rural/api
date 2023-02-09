package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.Coleta;
import com.hackathon.showrural.hackathon.model.ColetaIdeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColetaIdealRepository extends JpaRepository<ColetaIdeal, Long> {
}
