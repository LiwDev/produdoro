package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.credencial.application.service.CredencialApplicationService;
import dev.wakandaacademy.produdoro.promodoro.application.service.PromodoroApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoRequest;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.infra.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService {

    private final PromodoroApplicationService promodoroApplicationService;
    private CredencialApplicationService credencialApplicationService;
    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioCriadoRequest usuarioNovo) {
        log.info("[Start] UsuarioService - criaNovoUsuario");
        var configuracaoPadrao =  promodoroApplicationService.getConfiguracaoPadrao();

        var usuario = new Usuario(usuarioNovo,configuracaoPadrao );
        credencialApplicationService.criaNovaCrendencial(usuarioNovo);
       usuarioRepository.salva(usuario);
        log.info("[Finish] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }

}
