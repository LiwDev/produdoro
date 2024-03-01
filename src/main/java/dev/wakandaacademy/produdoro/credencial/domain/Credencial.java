package dev.wakandaacademy.produdoro.credencial.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "credencial")
public class Credencial {
    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String usuario;
    private String senha;

    public Credencial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = new BCryptPasswordEncoder().encode(senha) ;
    }
    public String getPassword(){
        return this.senha;
    }
}
