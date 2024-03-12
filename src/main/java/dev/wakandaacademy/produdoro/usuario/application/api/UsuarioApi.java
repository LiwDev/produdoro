package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Validated
@RestController
@RequestMapping(value = "/v1/usuario")
public interface UsuarioApi {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse postUsuarioNovo(@RequestBody @Valid UsuarioCriadoRequest usuarioNovo);
}
