package dev.wakandaacademy.produdoro.area.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "area")
public class Area {
    @Id
    private UUID idArea;
    @Indexed
    private UUID idUsuario;
    private String nome;
    private String descricao;
}
