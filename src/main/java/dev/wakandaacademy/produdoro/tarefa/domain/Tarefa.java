package dev.wakandaacademy.produdoro.tarefa.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "tarefa")
@Getter
public class Tarefa {
    @Id
    private UUID idTarefa;
    @Indexed
    private UUID idProjeto;
    @Indexed
    private UUID idUsuario;
    @Indexed
    private  UUID idArea;
    private String descricao;
    private String nome;
    @Builder.Default
    private StatusTarefa statusTarefa = StatusTarefa.A_FAZER;
}
