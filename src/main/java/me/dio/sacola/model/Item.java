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
@Entity                                                                     // Cria a tabela no Banco de Dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor

//tabela item vai se relacionar com duas tabelas: Sacola e Produto
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne                                                               // Relacionamento: um produto só pode ter um item
    private Produto produto;
    private int quantidade;
    @ManyToOne                                                              // Relacionamento: vários itens para uma sacola
    @JsonIgnore                                                             // Ignora erros Json
    private Sacola sacola;
}
