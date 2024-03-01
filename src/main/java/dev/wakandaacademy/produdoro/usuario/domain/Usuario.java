package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "usuario")
@Getter
public class Usuario {
    private UUID idUsuario;
    @Email
    private String email;
    private ConfiguracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario statusUsuario = StatusUsuario.FOCO;
    @Builder.Default
    private Integer QuantidadePromodoroPausaCurta = 0;
}
