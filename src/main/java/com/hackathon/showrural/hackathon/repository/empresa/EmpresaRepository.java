package com.hackathon.showrural.hackathon.repository.empresa;

import com.hackathon.showrural.hackathon.domain.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
