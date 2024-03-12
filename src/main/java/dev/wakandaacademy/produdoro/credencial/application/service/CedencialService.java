package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Validated
@Service
public class CedencialService implements CredencialApplicationService{

    @Override
    public Usuario criaNovaCrendencial(@Valid UsuarioCriadoRequest usuario) {
        return null;
    }
}
