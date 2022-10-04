package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;
import java.util.List;
import javax.persistence.*;

@AllArgsConstructor                                               // cria o construtor com todos os atributos (métodos getter e setter)
@Builder                                                          // traz o componente Sacola.Builder (é um design pattern) que ajuda a criar o objeto Sacola
@Data                                                             // traz todos os getter e setter
@Entity                                                           // Cria a tabela no Banco de Dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor                                                // impede de ter argumentos no construtor

// se relaciona com FormaPagamento, Cliente e Item
public class Sacola {
    @Id                                                           // cria o id, primary key
    @GeneratedValue(strategy = GenerationType.AUTO)               // gera o Id de forma automaticamente
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)          // relação de varias sacolas para um cliente
    @JsonIgnore                                                   // ignora erros de serialização
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)                         // ?Duvida? seria de uma sacola para muitos itens
    private List<Item> itens;
    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;


}
