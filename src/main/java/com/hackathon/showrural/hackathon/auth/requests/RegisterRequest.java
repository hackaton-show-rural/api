package com.hackathon.showrural.hackathon.auth.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull(message = "O campo [Nome] é obrigatório.")
    private String firstName;
    @NotNull(message = "O campo [Sobrenome] é obrigatório.")
    private String lastName;
    @NotNull(message = "O campo [CPF] é obrigatório.")
    private String cpf;
    @NotNull(message = "O campo [Senha] é obrigatório.")
    private String password;
}
