package com.hackathon.showrural.hackathon.repository;

import com.hackathon.showrural.hackathon.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
