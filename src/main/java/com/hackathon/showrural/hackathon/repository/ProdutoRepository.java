package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
