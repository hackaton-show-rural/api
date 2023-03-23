package com.hackathon.showrural.hackathon.service.usuario;

import com.hackathon.showrural.hackathon.domain.ContextoUsuario;
import com.hackathon.showrural.hackathon.repository.empresa.EmpresaRepository;
import com.hackathon.showrural.hackathon.repository.usuario.ProdutorRepository;
import com.hackathon.showrural.hackathon.controller.usuario.requests.ProdutorRequest;
import com.hackathon.showrural.hackathon.domain.usuario.Produtor;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import com.hackathon.showrural.hackathon.service.empresa.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProdutorService {
    final UsuarioService usuarioService;
    final ProdutorRepository produtorRepository;
    final EmpresaService empresaService;
    final ContextoUsuario contextoUsuario;

    public Produtor createUser(ProdutorRequest request) {
        var user = Usuario.builder()
                .cpf(request.getCpf())
                .role(request.getRole())
                .empresa(empresaService.getById(contextoUsuario.getEmpresaId()))
                .build();
        usuarioService.save(user);
        var produtor = Produtor.builder().usuario(user).build();
        return save(produtor);
    }

    public Produtor save(Produtor produtor) {
        return produtorRepository.save(produtor);
    }
}
