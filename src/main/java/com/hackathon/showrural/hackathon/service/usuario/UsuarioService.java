package com.hackathon.showrural.hackathon.service.usuario;

import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import com.hackathon.showrural.hackathon.repository.usuario.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario findByCpf(String cpf) {
        return usuarioRepository.findByCpf(cpf).orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado na base de dados. Verifique os dados e tente novamente."));
    }
    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    public boolean isFirstUser(){
        return getAll().isEmpty();
    }
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void refresh(){
        usuarioRepository.flush();
    }


}
