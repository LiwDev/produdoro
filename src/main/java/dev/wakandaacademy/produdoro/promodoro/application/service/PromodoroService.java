package dev.wakandaacademy.produdoro.promodoro.application.service;

import dev.wakandaacademy.produdoro.promodoro.padrao.ConfiguracaoPadrao;
import org.springframework.stereotype.Service;

@Service
public class PromodoroService implements PromodoroApplicationService{
    @Override
    public ConfiguracaoPadrao getConfiguracaoPadrao() {
        return  ConfiguracaoPadrao.builder()
                .tempoFoco(5)
                .tempoPausaCurto(5)
                .tempoPausaLonga(5)
                .repeticoesPausaLonga(5)
                .build();
    }
}
