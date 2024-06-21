package unifacef.edo.tic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.BlogDTO;
import unifacef.edo.tic.model.entities.BlogEntity;
import unifacef.edo.tic.model.repositories.BlogRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlogService {
    @Autowired
    ConversorService conversorService;
    @Autowired
    BlogRepository injecao;

    public BlogDTO insere(BlogDTO blogDTO){
        BlogEntity blogEntity = conversorService.converte_blogDTO(blogDTO);
        blogEntity = injecao.save(blogEntity);
        return conversorService.converte_blogEntity(blogEntity);
    }

    public List<BlogDTO> listar(){
        // faz a consulta e recebe uma lista
        List<BlogEntity> todos = injecao.findAll();
        return todos.stream().map(conversorService::converte_blogEntity).collect(Collectors.toList());
    }

    public BlogDTO colsultaPorId(Long id){
        //retorna um adm caso o id seja encontrado
        Optional<BlogEntity> optional = injecao.findById(id);
        if(optional.isPresent()){
            return conversorService.converte_blogEntity(optional.get());
        }
        return null; //caso não encontre um valor
    }

    public String remove(Long id) {
        if (injecao.existsById(id)) { //verifica se existe o id passado pelo usuário
            injecao.deleteById(id);
            return "Remoção realizada com sucesso";
        }
        return "Nenhum diretor foi removido";
    }

    public BlogDTO atualizaPorId(Long id, BlogDTO blogDTO){
        if(injecao.existsById(id)){
            blogDTO.setId(id); //adiciona o id no adm que será atualizado
            // converte DTO em Entity
            BlogEntity blog= conversorService.converte_blogDTO(blogDTO);
            // vai atualizar, pois tem um id que existe no BD
            return conversorService.converte_blogEntity(injecao.save(blog));
        }
        else return null; //caso não tenha o id no bd
    }
}
