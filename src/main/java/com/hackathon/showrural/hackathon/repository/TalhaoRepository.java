package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.Talhao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalhaoRepository extends JpaRepository<Talhao, Long> {
}
