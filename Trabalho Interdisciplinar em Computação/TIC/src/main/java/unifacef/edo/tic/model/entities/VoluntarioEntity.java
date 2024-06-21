package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_voluntario")
public class VoluntarioEntity extends PessoaEntity{

    @Column(name = "areaAtuacao")
    private String areaAtuacao;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

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
}
