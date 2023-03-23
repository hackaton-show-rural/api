package com.hackathon.showrural.hackathon.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hackathon.showrural.hackathon.domain.empresa.Empresa;
import com.hackathon.showrural.hackathon.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class ContextoUsuario{
    @NotNull(message = "Empresa de contexto não pode ser nula")
    private Long empresaId;
    @NotNull(message = "Usuário de contexto não pode ser nulo")
    private Long usuarioId;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inicioContexto;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fimContexto;
}

