// class interface para se conectar com a tabela de Cliente

package me.dio.sacola.repository;

import me.dio.sacola.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   //conecta com o banco de dados

//Vou pegar esse repository e extender de uma outra inferace "JpaRepository" e dizer qual o tipo de
// classe que eu quero ter acesso no banco de dados <Restaurante, Long (Tipo do Id do restaurante) >
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
