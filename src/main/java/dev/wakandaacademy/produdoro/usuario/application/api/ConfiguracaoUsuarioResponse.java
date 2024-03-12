package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {
    private final Integer tempoFoco;
    private final Integer tempoPausaCurto;
    private final Integer tempoPausaLonga;
    private final Integer repeticoesPausaLonga;

    public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
    this.tempoFoco = configuracao.getTempoFoco();
        this.tempoPausaCurto = configuracao.getTempoPausaCurto();
        this.tempoPausaLonga = configuracao.getTempoPausaLonga();
        this.repeticoesPausaLonga = configuracao.getRepeticoesPausaLonga();
    }
}
