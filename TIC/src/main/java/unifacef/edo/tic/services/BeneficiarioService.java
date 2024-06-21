package unifacef.edo.tic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.BeneficiarioDTO;
import unifacef.edo.tic.model.entities.BeneficiarioEntity;
import unifacef.edo.tic.model.repositories.BeneficiarioRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BeneficiarioService {
    @Autowired
    BeneficiarioRepository injecao;
    @Autowired
    ConversorService conversorService;

    public BeneficiarioDTO insere(BeneficiarioDTO beneficiarioDTO){
        //Recebe um valor de BeneficiarioDTO do usuario, converte em service e salva no banco
        BeneficiarioEntity beneficiarioEntity = conversorService.converte_benDTO(beneficiarioDTO);
        beneficiarioEntity = injecao.save(beneficiarioEntity);
        return conversorService.converte_benEntity(beneficiarioEntity);
    }

    public List<BeneficiarioDTO> listar(){
        // faz a consulta e recebe uma lista de BeneficiarioEntity
        List<BeneficiarioEntity> todos = injecao.findAll();
        return todos.stream().map(conversorService::converte_benEntity).collect(Collectors.toList());
    }

    public BeneficiarioDTO colsultaPorId(Long id){
        //retorna um beneficiário caso o id seja encontrado
        Optional<BeneficiarioEntity> optional = injecao.findById(id);
        if(optional.isPresent()){
            return conversorService.converte_benEntity(optional.get());
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

    public BeneficiarioDTO atualizaPorId(Long id, BeneficiarioDTO beneficiario){
        if(injecao.existsById(id)){
            beneficiario.setId(id); //adiciona o id no beneficiario que será atualizado
            // converte DTO em Entity
            BeneficiarioEntity beneficiarioEntity= conversorService.converte_benDTO(beneficiario);
            // vai atualizar, pois tem um id que existe no BD
            return conversorService.converte_benEntity(injecao.save(beneficiarioEntity));
        }
        else return null; //caso não tenha o id no bd
    }

    public List<BeneficiarioDTO> atualizaSituacao(){
        List<BeneficiarioEntity> beneficiarios = injecao.findAll();
        for(BeneficiarioEntity beneficiario: beneficiarios){
            beneficiario.setSituacao("Em espera");
        }
        //salava o valor alterado
        List<BeneficiarioEntity> beneficiariosEntity = injecao.saveAll(beneficiarios);
        return beneficiariosEntity.stream().map(conversorService::converte_benEntity).collect(Collectors.toList());
    }
}
