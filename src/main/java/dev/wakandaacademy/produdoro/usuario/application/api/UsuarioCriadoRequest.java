package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Value;



@Value
public class UsuarioCriadoRequest {
    @Email
    private final String email;
    @Size(min = 6)
    private final String senha;
}
