package unifacef.edo.tic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edo.tic.model.DTOs.BeneficiarioDTO;
import unifacef.edo.tic.services.BeneficiarioService;

import java.util.List;


@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {
    //injecao de dependencia
    @Autowired
    BeneficiarioService injecao;

    @PostMapping
    public BeneficiarioDTO insere(@RequestBody BeneficiarioDTO beneficiario){
        return injecao.insere(beneficiario);
    }

    @GetMapping
    public List<BeneficiarioDTO> listar(){
        return injecao.listar();
    }

    @GetMapping("/{id}")
    public BeneficiarioDTO consultaPorId(@PathVariable Long id){
        return injecao.colsultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PutMapping
    public List<BeneficiarioDTO> atualizaSituacao(){
        return injecao.atualizaSituacao();
    }

    @PatchMapping("/{id}")
    public BeneficiarioDTO atualizaPorId(@PathVariable Long id, @RequestBody BeneficiarioDTO beneficiarioDTO){
        return injecao.atualizaPorId(id, beneficiarioDTO);
    }

}
