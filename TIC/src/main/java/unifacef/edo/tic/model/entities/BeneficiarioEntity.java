package unifacef.edo.tic.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_beneficiario")
public class BeneficiarioEntity extends PessoaEntity{

    @Column(name = "solicitacao")
    private String solicitacao;

    @Column(name = "situacao")
    private String situacao;

    @Column(name = "imagenURL")
    private String imagensURL;

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getImagensURL() {
        return imagensURL;
    }

    public void setImagensURL(String imagensURL) {
        this.imagensURL = imagensURL;
    }
}
