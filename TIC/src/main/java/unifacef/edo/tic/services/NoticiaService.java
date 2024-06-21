package unifacef.edo.tic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.NoticiaDTO;
import unifacef.edo.tic.model.entities.AdministradorEntity;
import unifacef.edo.tic.model.entities.BlogEntity;
import unifacef.edo.tic.model.entities.NoticiaEntity;
import unifacef.edo.tic.model.repositories.AdministradorRepository;
import unifacef.edo.tic.model.repositories.BlogRepository;
import unifacef.edo.tic.model.repositories.NoticiasRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NoticiaService {
    @Autowired
    NoticiasRepository injecaoNoticia;
    @Autowired
    AdministradorRepository injecaoAdm;
    @Autowired
    BlogRepository injecaoBlog;
    @Autowired
    ConversorService conversorService;

    public NoticiaDTO insere(NoticiaDTO noticiaDTO){

        AdministradorEntity administradorEntity = conversorService.converte_admDTO(noticiaDTO.getAdministrador());
        administradorEntity = injecaoAdm.save(administradorEntity);

        BlogEntity blog = conversorService.converte_blogDTO((noticiaDTO.getBlog()));
        blog = injecaoBlog.save(blog);

        NoticiaEntity auxEntity = conversorService.converte_noticiaDTO((noticiaDTO));

        auxEntity.setAdministrador(administradorEntity);
        System.out.println(auxEntity.toString());

        auxEntity.setBlog(blog);
        System.out.println(auxEntity.toString());

        NoticiaEntity novoEntity = injecaoNoticia.save(auxEntity);

        return conversorService.converte_noticiaEntity(novoEntity);
    }


    public List<NoticiaDTO> consultaTodos(){
        List<NoticiaEntity> filmes = injecaoNoticia.findAll();
        return filmes.stream().map(conversorService::converte_noticiaEntity).collect(Collectors.toList());
    }


    public NoticiaDTO consultaPorId(String titulo){
        // retorna um valor opcional, pois pode encontrar ou não
        Optional<NoticiaEntity> optional = injecaoNoticia.findById(titulo);
        if (optional.isPresent()){ // caso encontrou
            return conversorService.converte_noticiaEntity(optional.get()); // converte Entity em DTO
        }
        else return null; // não encontrou
    }

    public String remove(String titulo){
        if (injecaoNoticia.existsById(titulo)){
            injecaoNoticia.deleteById(titulo);
            return "Remoção com sucesso";
        }
        else {
            return "Filme não encontrado";
        }
    }

    public List<NoticiaDTO> atualizaDesc(){
        List<NoticiaEntity> noticias = injecaoNoticia.findAll();
        for(NoticiaEntity noticia: noticias){
            noticia.setDescricao("Noticia em analise");
            injecaoNoticia.save(noticia); //
        }
        return noticias.stream().map(conversorService::converte_noticiaEntity).collect(Collectors.toList());
    }

    public NoticiaDTO atualizaId(String titulo, NoticiaDTO noticiaDTO){
        if (injecaoNoticia.existsById(titulo)) {
            noticiaDTO.setTitulo(titulo + "!");
            return conversorService.converte_noticiaEntity(injecaoNoticia.save(conversorService.converte_noticiaDTO(noticiaDTO)));
        }
        else {
            return null;
        }
    }

}
