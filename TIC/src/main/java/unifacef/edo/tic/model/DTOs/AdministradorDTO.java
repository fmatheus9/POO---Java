package unifacef.edo.tic.model.DTOs;

import unifacef.edo.tic.model.entities.NoticiaEntity;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDTO extends PessoaDTO{
    private String login;

    private String senha;
    private List<NoticiaEntity> noticias = new ArrayList<NoticiaEntity>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<NoticiaEntity> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<NoticiaEntity> noticias) {
        this.noticias = noticias;
    }
}
