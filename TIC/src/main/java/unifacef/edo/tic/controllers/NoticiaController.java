package unifacef.edo.tic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edo.tic.model.DTOs.NoticiaDTO;
import unifacef.edo.tic.services.NoticiaService;

import java.util.List;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {
    @Autowired
    NoticiaService injecao;

    @PostMapping
    public NoticiaDTO inserir(@RequestBody NoticiaDTO noticiaDTO){
        return injecao.insere(noticiaDTO);
    }

    @GetMapping
    public List<NoticiaDTO> consultaTodos(){
        return injecao.consultaTodos();
    }

    @GetMapping("/{id}")
    public NoticiaDTO consultaPorId(@PathVariable String titulo){
        return injecao.consultaPorId(titulo);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable String titulo){
        return injecao.remove(titulo);
    }

    @PutMapping
    public List<NoticiaDTO> atualizaDesc(){
        return injecao.atualizaDesc();
    }

    @PatchMapping("/{id}")
    public NoticiaDTO atualizaId(@PathVariable String titulo, @RequestBody NoticiaDTO noticiaDTO){
        return injecao.atualizaId(titulo, noticiaDTO);
    }
}
