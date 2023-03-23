package com.hackathon.showrural.hackathon.repository.talhao;

import com.hackathon.showrural.hackathon.domain.talhao.Talhao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalhaoRepository extends JpaRepository<Talhao, Long> {
}
