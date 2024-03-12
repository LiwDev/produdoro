package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioApi{

    private final UsuarioApplicationService usuarioApplicationService;

    @Override
    public UsuarioCriadoResponse postUsuarioNovo(UsuarioCriadoRequest usuarioNovo) {
        log.info("[Start] UsuarioController - postUsuarioNovo");
        UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
        log.info("[finish] UsuarioController - postUsuarioNovo");

        return usuarioCriado;
    }

    @GetMapping
    public void  getMap(){
        log.info("[Start] UsuarioController - postUsuarioNovo");

    }
}
