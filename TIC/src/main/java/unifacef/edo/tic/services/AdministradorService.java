package unifacef.edo.tic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.AdministradorDTO;
import unifacef.edo.tic.model.entities.AdministradorEntity;
import unifacef.edo.tic.model.repositories.AdministradorRepository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdministradorService {
    @Autowired
    AdministradorRepository injecao;
    @Autowired
    ConversorService conversorService;

    public AdministradorDTO insere(AdministradorDTO administradorDTO){
        //Recebe um valor de AdministradorDTO do usuario, converte em service e salva no banco
        AdministradorEntity administradorEntity = conversorService.converte_admDTO(administradorDTO);
        administradorEntity = injecao.save(administradorEntity);
        return conversorService.converte_admEntity(administradorEntity);
    }

    public List<AdministradorDTO> listar(){
        // faz a consulta e recebe uma lista de administradorEntity
        List<AdministradorEntity> todos = injecao.findAll();
        return todos.stream().map(conversorService::converte_admEntity).collect(Collectors.toList());
    }

    public AdministradorDTO colsultaPorId(Long id){
        //retorna um adm caso o id seja encontrado
        Optional<AdministradorEntity> optional = injecao.findById(id);
        if(optional.isPresent()){
            return conversorService.converte_admEntity(optional.get());
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

    public AdministradorDTO atualizaPorId(Long id, AdministradorDTO adm){
        if(injecao.existsById(id)){
            adm.setId(id); //adiciona o id no adm que será atualizado
            // converte DTO em Entity
            AdministradorEntity administradorEntity= conversorService.converte_admDTO(adm);
            // vai atualizar, pois tem um id que existe no BD
            return conversorService.converte_admEntity(injecao.save(administradorEntity));
        }
        else return null; //caso não tenha o id no bd
    }

}
