package com.hackathon.showrural.hackathon.repository.produto;

import com.hackathon.showrural.hackathon.domain.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
