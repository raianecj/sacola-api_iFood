package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity                                                                 // Cria a tabela no Banco de Dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor

// se relaciona com Item e Restaurante
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double valorUnitario;
    @Builder.Default                                                    // deixa setado, predefinido que o produto está disponivel (true)
    private Boolean disponivel = true;
    @ManyToOne                                                          // um restaurante tem varios produtos
    @JsonIgnore
    private Restaurante restaurante;
}
