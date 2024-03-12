package dev.wakandaacademy.produdoro.usuario.application.infra;

import dev.wakandaacademy.produdoro.usuario.domain.Usuario;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
}
