package com.hackathon.showrural.hackathon.service.usuario;

import com.hackathon.showrural.hackathon.domain.ContextoUsuario;
import com.hackathon.showrural.hackathon.repository.empresa.EmpresaRepository;
import com.hackathon.showrural.hackathon.repository.usuario.AplicadorRepository;
import com.hackathon.showrural.hackathon.controller.usuario.requests.AplicadorRequest;
import com.hackathon.showrural.hackathon.domain.usuario.Aplicador;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import com.hackathon.showrural.hackathon.service.empresa.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AplicadorService {
    final UsuarioService usuarioService;
    final EmpresaService empresaService;
    final AplicadorRepository aplicadorRepository;
    final ContextoUsuario contextoUsuario;

    public Aplicador createUser(AplicadorRequest request) {
        var user = Usuario.builder()
                .cpf(request.getCpf())
                .role(request.getRole())
                .empresa(empresaService.getById(contextoUsuario.getEmpresaId()))
                .build();
        usuarioService.save(user);
        var aplicador = Aplicador.builder()
                .usuario(user)
                .build();
        return save(aplicador);
    }

    public Aplicador save(Aplicador aplicador) {
        return aplicadorRepository.save(aplicador);
    }

    public List<Aplicador> getAll() {
        return aplicadorRepository.findAll();
    }
}
