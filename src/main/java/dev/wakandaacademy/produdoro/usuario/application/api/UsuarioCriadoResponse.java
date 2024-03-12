package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.Random;
import java.util.UUID;

@Data
@Value

public class UsuarioCriadoResponse {
    private final UUID idUsuario;

    private final String email;
    private final ConfiguracaoUsuarioResponse configuracao;

    private StatusUsuario statusUsuario;

    private final Integer QuantidadePromodoroPausaCurta = 0;

    public UsuarioCriadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.configuracao = new ConfiguracaoUsuarioResponse(usuario.getConfiguracao());
        this.statusUsuario = usuario.getStatusUsuario();
    }
}
