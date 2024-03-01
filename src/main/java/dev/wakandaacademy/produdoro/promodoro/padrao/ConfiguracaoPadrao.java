package dev.wakandaacademy.produdoro.promodoro.padrao;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "configuracaoPadraoPromodoro")
@Getter
public class ConfiguracaoPadrao {
    private static final String CODIGO_DEFAULT="DEFAULT";
    @Builder.Default
    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String codigo = CODIGO_DEFAULT;
    private Integer tempoFoco;
    private Integer tempoPausaCurto;
    private Integer tempoPausaLonga;
    private Integer repeticoesPausaLonga;
}
