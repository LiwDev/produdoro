package dev.wakandaacademy.produdoro.usuario.application.infra;

import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UsuarioSpringMongoRepository extends MongoRepository<Usuario, UUID> {
}
