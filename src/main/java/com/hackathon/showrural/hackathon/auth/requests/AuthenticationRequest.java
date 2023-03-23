package com.hackathon.showrural.hackathon.auth.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    @NotBlank(message = "O campo [Login] é obrigatório.")
    private String login;
    @NotBlank(message = "O campo [Senha] é obrigatório.")
    String password;
}
