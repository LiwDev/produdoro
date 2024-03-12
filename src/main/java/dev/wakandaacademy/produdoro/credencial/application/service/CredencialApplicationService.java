package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

@Validated
public interface CredencialApplicationService {
   Usuario criaNovaCrendencial(@Valid UsuarioCriadoRequest usuario);
}
