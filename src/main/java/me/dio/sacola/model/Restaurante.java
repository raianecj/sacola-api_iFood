package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity                                                             // Cria a tabela no Banco de Dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor

// se relaciona com Produto e incorpora Endereço
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded                                                       // para reusar uma classe sem usar banco de dados
    private Endereco endereco;



}
