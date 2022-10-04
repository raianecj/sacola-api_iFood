// Camada de Serviço, com 3 funcionalidades: Ver sacola, incluir itens na sacola, fechar sacola

package me.dio.sacola.service;

import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);


}
