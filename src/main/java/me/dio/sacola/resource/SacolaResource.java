// A classe resource serve para designar as urls

package me.dio.sacola.resource;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value="/ifood-devweek/sacolas" )

@RestController                                                                             //define a classe como endpoints
@RequestMapping("/ifood-devweek/sacolas")                                                   //define como será escrito os endpoints (as urls)
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping                                                                             //inserir o item na sacola
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){

        return sacolaService.incluirItemNaSacola(itemDto);
    }
    @GetMapping("/{id}")                                                                     //retonar uma informação
    public Sacola verSacola(@PathVariable("id") Long id) {
        return sacolaService.verSacola(id);

    }
    @PatchMapping("/fecharSacola/{sacolaId}")                                                 // para atualizar uma informação no banco de dados (usa-se patch quando são poucas informações)
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);

    }

}
