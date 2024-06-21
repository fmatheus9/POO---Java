package unifacef.edo.tic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edo.tic.model.DTOs.BeneficiarioDTO;
import unifacef.edo.tic.model.DTOs.VoluntarioDTO;
import unifacef.edo.tic.services.VoluntarioService;

import java.util.List;

@RestController
@RequestMapping("/voluntario")
public class VoluntarioController {
    @Autowired
    VoluntarioService injecao;
    @PostMapping
    public VoluntarioDTO insere(@RequestBody VoluntarioDTO voluntario){
        return injecao.insere(voluntario);
    }

    @GetMapping
    public List<VoluntarioDTO> listar(){
        return injecao.listar();
    }

    @GetMapping("/{id}")
    public VoluntarioDTO consultaPorId(@PathVariable Long id){
        return injecao.colsultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PatchMapping("/{id}")
    public VoluntarioDTO atualizaPorId(@PathVariable Long id, @RequestBody VoluntarioDTO voluntarioDTO){
        return injecao.atualizaPorId(id, voluntarioDTO);
    }
}
