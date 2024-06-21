package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_administrador")
public class AdministradorEntity extends PessoaEntity{

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;
    @OneToMany(mappedBy = "administrador", cascade = CascadeType.ALL, orphanRemoval = true)
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
