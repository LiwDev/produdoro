package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfiguracaoUsuario {
    private Integer tempoFoco;
    private Integer tempoPausaCurto;
    private Integer tempoPausaLonga;
    private Integer repeticoesPausaLonga;

}
