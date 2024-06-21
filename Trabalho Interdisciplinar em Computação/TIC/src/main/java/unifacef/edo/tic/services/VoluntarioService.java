package unifacef.edo.tic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.VoluntarioDTO;
import unifacef.edo.tic.model.entities.VoluntarioEntity;
import unifacef.edo.tic.model.repositories.VoluntarioRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VoluntarioService {
    @Autowired
    VoluntarioRepository injecao;
    @Autowired
    ConversorService conversorService;

    public VoluntarioDTO insere(VoluntarioDTO voluntarioDTO){
        //Recebe um valor de VoluntarioDTO do usuario, converte em service e salva no banco
        VoluntarioEntity voluntarioEntity = conversorService.converte_voluntarioDTO(voluntarioDTO);
        voluntarioEntity = injecao.save(voluntarioEntity);
        return conversorService.converte_voluntarioEntity(voluntarioEntity);
    }

    public List<VoluntarioDTO> listar(){
        // faz a consulta e recebe uma lista de VoluntarioEntity
        List<VoluntarioEntity> todos = injecao.findAll();
        return todos.stream().map(conversorService::converte_voluntarioEntity).collect(Collectors.toList());
    }

    public VoluntarioDTO colsultaPorId(Long id){
        //retorna um Voluntario caso o id seja encontrado
        Optional<VoluntarioEntity> optional = injecao.findById(id);
        if(optional.isPresent()){
            return conversorService.converte_voluntarioEntity(optional.get());
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

    public VoluntarioDTO atualizaPorId(Long id, VoluntarioDTO voluntario){
        if(injecao.existsById(id)){
            voluntario.setId(id); //adiciona o id no voluntario que será atualizado
            // converte DTO em Entity
            VoluntarioEntity voluntarioEntity= conversorService.converte_voluntarioDTO(voluntario);
            // vai atualizar, pois tem um id que existe no BD
            return conversorService.converte_voluntarioEntity(injecao.save(voluntarioEntity));
        }
        else return null; //caso não tenha o id no bd
    }

}
