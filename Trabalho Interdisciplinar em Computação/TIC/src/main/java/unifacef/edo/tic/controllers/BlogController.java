package unifacef.edo.tic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edo.tic.model.DTOs.AdministradorDTO;
import unifacef.edo.tic.model.DTOs.BlogDTO;
import unifacef.edo.tic.services.AdministradorService;
import unifacef.edo.tic.services.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService injecao;
    @PostMapping
    public BlogDTO insere(@RequestBody BlogDTO BlogDTO){
        return injecao.insere(BlogDTO);
    }

    @GetMapping
    public List<BlogDTO> listar(){
        return injecao.listar();
    }

    @GetMapping("/{id}")
    public BlogDTO consultaPorId(@PathVariable Long id){
        return injecao.colsultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PatchMapping("/{id}")
    public BlogDTO atualizaPorId(@PathVariable Long id, @RequestBody BlogDTO blogDTO){
        return injecao.atualizaPorId(id, blogDTO);
    }
}
