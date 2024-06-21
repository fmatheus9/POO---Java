package unifacef.edo.tic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edo.tic.model.DTOs.AdministradorDTO;
import unifacef.edo.tic.model.DTOs.VoluntarioDTO;
import unifacef.edo.tic.services.AdministradorService;
import unifacef.edo.tic.services.VoluntarioService;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    AdministradorService injecao;
    @PostMapping
    public AdministradorDTO insere(@RequestBody AdministradorDTO administradorDTO){
        return injecao.insere(administradorDTO);
    }

    @GetMapping
    public List<AdministradorDTO> listar(){
        return injecao.listar();
    }

    @GetMapping("/{id}")
    public AdministradorDTO consultaPorId(@PathVariable Long id){
        return injecao.colsultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PatchMapping("/{id}")
    public AdministradorDTO atualizaPorId(@PathVariable Long id, @RequestBody AdministradorDTO administradorDTO){
        return injecao.atualizaPorId(id, administradorDTO);
    }
}
