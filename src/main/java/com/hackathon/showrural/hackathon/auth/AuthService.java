package com.hackathon.showrural.hackathon.auth;

import com.hackathon.showrural.hackathon.auth.requests.AuthenticationRequest;
import com.hackathon.showrural.hackathon.auth.requests.RegisterRequest;
import com.hackathon.showrural.hackathon.auth.responses.AuthenticationResponse;
import com.hackathon.showrural.hackathon.auth.responses.RegisterResponse;
import com.hackathon.showrural.hackathon.configuration.JwtService;
import com.hackathon.showrural.hackathon.domain.ContextoUsuario;
import com.hackathon.showrural.hackathon.domain.usuario.Role;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import com.hackathon.showrural.hackathon.repository.empresa.EmpresaRepository;
import com.hackathon.showrural.hackathon.service.usuario.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UsuarioService usuarioService;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final EmpresaRepository empresaRepository;
    private final ContextoUsuario contextoUsuario;

    public RegisterResponse register(RegisterRequest request) {
        if (usuarioService.isFirstUser()) {
            var user = Usuario.builder()
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .cpf(request.getCpf())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .role(Role.PRODUTOR)
                    .empresa(empresaRepository.findAll().stream().findFirst().get())
                    .build();
            usuarioService.save(user);
            var jwtToken = jwtService.generateToken(user);
            return RegisterResponse.builder()
                    .id(user.getId())
                    .cpf(user.getCpf())
                    .dataCadastro(user.getDataCadastro())
                    .build();
        }
        var user = usuarioService.findByCpf(request.getCpf());
        if (user != null) {
            user.setFirstName(request.getFirstName());
            user.setLastName(request.getLastName());
            user.setCpf(request.getCpf());
            user.setPassword(passwordEncoder.encode(request.getPassword()));
            user.setRole(user.getRole());
            usuarioService.refresh();
            var jwtToken = jwtService.generateToken(user);
            return RegisterResponse.builder()
                    .id(user.getId())
                    .cpf(user.getCpf())
                    .dataCadastro(user.getDataCadastro())
                    .build();
        }
        return RegisterResponse.builder().build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getLogin(),
                        request.getPassword()
                )
        );
        var user = usuarioService.findByCpf(request.getLogin());
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .expiration(jwtService.getTokenExpiration(jwtToken))
                .type("Bearer Token")
                .build();
    }
}
