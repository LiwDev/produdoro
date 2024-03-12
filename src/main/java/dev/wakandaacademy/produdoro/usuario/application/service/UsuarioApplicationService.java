package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoRequest;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;

public interface UsuarioApplicationService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioCriadoRequest usuarioNovo);
}
