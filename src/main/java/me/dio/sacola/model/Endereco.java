package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable                                 // "Incorporavel" pode ser embutido/incorporado (embedded) em outras tabelas para reusar uma classe sem usar banco de dados
@NoArgsConstructor

public class Endereco {
    private String cep;
    private String complemento;
}
