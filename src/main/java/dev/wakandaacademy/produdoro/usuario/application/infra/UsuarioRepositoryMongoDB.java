package dev.wakandaacademy.produdoro.usuario.application.infra;

import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@RequiredArgsConstructor
public class UsuarioRepositoryMongoDB implements UsuarioRepository{
    private final UsuarioSpringMongoRepository usuarioSpringMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioSpringMongoRepository.save(usuario);
    }
}
