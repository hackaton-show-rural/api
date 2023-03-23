package com.hackathon.showrural.hackathon.auth;

import com.hackathon.showrural.hackathon.domain.usuario.Role;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import com.hackathon.showrural.hackathon.repository.usuario.UsuarioRepository;
import com.hackathon.showrural.hackathon.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {
    final UsuarioService usuarioService;
    public Role verifyRoleByCpf(String cpf){
        return usuarioService.findByCpf(cpf).getRole();
    }
}
