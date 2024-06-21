package unifacef.edo.tic.services;

import org.springframework.stereotype.Service;
import unifacef.edo.tic.model.DTOs.*;
import unifacef.edo.tic.model.entities.*;

@Service
public class ConversorService {
    public AdministradorEntity converte_admDTO(AdministradorDTO administradorDTO){
        if (administradorDTO == null){
            return null;
        }
        AdministradorEntity aux = new AdministradorEntity();
        aux.setId(administradorDTO.getId());
        aux.setLogin(administradorDTO.getLogin());
        aux.setSenha(administradorDTO.getSenha());
        aux.setCpf(administradorDTO.getCpf());
        aux.setNome(administradorDTO.getNome());
        aux.setEndereco(administradorDTO.getEndereco());
        aux.setTelefone(administradorDTO.getTelefone());
        return aux;
    }
    public AdministradorDTO converte_admEntity(AdministradorEntity administradorEntity){
        if (administradorEntity == null){
            return null;
        }
        AdministradorDTO aux = new AdministradorDTO();
        aux.setId(administradorEntity.getId());
        aux.setLogin(administradorEntity.getLogin());
        aux.setSenha(administradorEntity.getSenha());
        aux.setCpf(administradorEntity.getCpf());
        aux.setNome(administradorEntity.getNome());
        aux.setEndereco(administradorEntity.getEndereco());
        aux.setTelefone(administradorEntity.getTelefone());
        return aux;
    }

    public BeneficiarioEntity converte_benDTO(BeneficiarioDTO beneficiarioDTO){
        if(beneficiarioDTO == null){
            return null;
        }
        BeneficiarioEntity aux = new BeneficiarioEntity();
        aux.setId(beneficiarioDTO.getId());
        aux.setCpf(beneficiarioDTO.getCpf());
        aux.setNome(beneficiarioDTO.getNome());
        aux.setEndereco(beneficiarioDTO.getEndereco());
        aux.setTelefone(beneficiarioDTO.getTelefone());
        aux.setImagensURL(beneficiarioDTO.getImagensURL());
        aux.setSituacao(beneficiarioDTO.getSituacao());
        aux.setSolicitacao(beneficiarioDTO.getSolicitacao());
        return aux;
    }

    public BeneficiarioDTO converte_benEntity(BeneficiarioEntity beneficiarioEntity){
        if(beneficiarioEntity == null){
            return null;
        }
        BeneficiarioDTO aux = new BeneficiarioDTO();
        aux.setId(beneficiarioEntity.getId());
        aux.setCpf(beneficiarioEntity.getCpf());
        aux.setNome(beneficiarioEntity.getNome());
        aux.setEndereco(beneficiarioEntity.getEndereco());
        aux.setTelefone(beneficiarioEntity.getTelefone());
        aux.setImagensURL(beneficiarioEntity.getImagensURL());
        aux.setSituacao(beneficiarioEntity.getSituacao());
        aux.setSolicitacao(beneficiarioEntity.getSolicitacao());
        return aux;
    }

    public BlogEntity converte_blogDTO(BlogDTO blogDTO){
        if (blogDTO == null){
            return null;
        }
        BlogEntity aux = new BlogEntity();
        aux.setId(blogDTO.getId());
        aux.setNoticias(blogDTO.getNoticias());
        return aux;
    }

    public BlogDTO converte_blogEntity(BlogEntity blogEntity){
        if (blogEntity == null){
            return null;
        }
        BlogDTO aux = new BlogDTO();
        aux.setId(blogEntity.getId());
        aux.setNoticias(blogEntity.getNoticias());
        return aux;
    }

    public NoticiaEntity converte_noticiaDTO(NoticiaDTO noticiaDTO){
        if(noticiaDTO == null){
            return null;
        }
        NoticiaEntity aux = new NoticiaEntity();

        aux.setTitulo(noticiaDTO.getTitulo());
        aux.setDescricao(noticiaDTO.getDescricao());
        aux.setLink(noticiaDTO.getLink());
        aux.setImagemURL(noticiaDTO.getImagemURL());
        aux.setAdministrador(noticiaDTO.getAdministrador());
        aux.setBlog(noticiaDTO.getBlog());
        return aux;
    }

    public NoticiaDTO converte_noticiaEntity(NoticiaEntity noticiaEntity){
        if(noticiaEntity == null){
            return null;
        }
        NoticiaDTO aux = new NoticiaDTO();
        aux.setTitulo(noticiaEntity.getTitulo());
        aux.setDescricao(noticiaEntity.getDescricao());
        aux.setLink(noticiaEntity.getLink());
        aux.setImagemURL(noticiaEntity.getImagemURL());
        aux.setAdministrador(noticiaEntity.getAdministrador());
        return aux;
    }

    public VoluntarioEntity converte_voluntarioDTO(VoluntarioDTO voluntarioDTO){
        if(voluntarioDTO == null){
            return null;
        }
        VoluntarioEntity aux = new VoluntarioEntity();
        aux.setId(voluntarioDTO.getId());
        aux.setLogin(voluntarioDTO.getLogin());
        aux.setCpf(voluntarioDTO.getCpf());
        aux.setNome(voluntarioDTO.getNome());
        aux.setEndereco(voluntarioDTO.getEndereco());
        aux.setSenha(voluntarioDTO.getSenha());
        aux.setAreaAtuacao(voluntarioDTO.getAreaAtuacao());
        return aux;
    }

    public VoluntarioDTO converte_voluntarioEntity(VoluntarioEntity voluntarioEntity){
        if(voluntarioEntity == null){
            return null;
        }
        VoluntarioDTO aux = new VoluntarioDTO();
        aux.setId(voluntarioEntity.getId());
        aux.setLogin(voluntarioEntity.getLogin());
        aux.setCpf(voluntarioEntity.getCpf());
        aux.setNome(voluntarioEntity.getNome());
        aux.setEndereco(voluntarioEntity.getEndereco());
        aux.setSenha(voluntarioEntity.getSenha());
        aux.setAreaAtuacao(voluntarioEntity.getAreaAtuacao());
        return aux;
    }


}
