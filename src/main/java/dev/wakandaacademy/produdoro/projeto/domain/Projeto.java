package dev.wakandaacademy.produdoro.projeto.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "projeto")
@Getter
public class Projeto {
    @Id
    private UUID idProjeto;
    @Indexed
    private UUID idUsuario;
    @Indexed
    private  UUID idArea;
    private String nome;
    private String descricao;
}
