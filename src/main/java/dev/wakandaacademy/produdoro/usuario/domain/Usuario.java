package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.promodoro.padrao.ConfiguracaoPadrao;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoRequest;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "usuario")
@Data
public class Usuario {
    private UUID idUsuario;
    @Email
    @Indexed(unique = true)
    private String email;
    private ConfiguracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario statusUsuario = StatusUsuario.FOCO;
    @Builder.Default
    private Integer QuantidadePromodoroPausaCurta = 0;

    public Usuario(UsuarioCriadoRequest usuarioNovo,ConfiguracaoPadrao configuracaoPadrao) {
       this.setIdUsuario(UUID.randomUUID());
        this.setEmail(usuarioNovo.getEmail());
        this.statusUsuario = StatusUsuario.FOCO;
        this.configuracao = new ConfiguracaoUsuario(configuracaoPadrao);
    }
}
