package com.hackathon.showrural.hackathon.controller.usuario.requests;

import com.hackathon.showrural.hackathon.domain.usuario.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AplicadorRequest {
    @NotBlank(message = "O campo [CPF] é obrigatório.")
    private String cpf;
    private Role role = Role.APLICADOR;
}
