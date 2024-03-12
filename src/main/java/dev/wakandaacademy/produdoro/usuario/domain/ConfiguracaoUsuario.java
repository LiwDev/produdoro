package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.promodoro.padrao.ConfiguracaoPadrao;
import lombok.*;

@Builder(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ConfiguracaoUsuario {
    private Integer tempoFoco;
    private Integer tempoPausaCurto;
    private Integer tempoPausaLonga;
    private Integer repeticoesPausaLonga;

    public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
     this.tempoFoco = configuracaoPadrao.getTempoFoco();
        this.tempoPausaCurto = configuracaoPadrao.getTempoPausaCurto();
        this.tempoPausaLonga = configuracaoPadrao.getTempoPausaLonga();
        this.repeticoesPausaLonga = configuracaoPadrao.getRepeticoesPausaLonga();
    }
}
