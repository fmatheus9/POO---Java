package unifacef.edo.tic.model.DTOs;



public class BeneficiarioDTO extends PessoaDTO{

    private String solicitacao;
    private String situacao;
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
