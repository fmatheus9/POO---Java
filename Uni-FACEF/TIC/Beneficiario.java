public class Beneficiario extends Pessoa{
    private String solicitacao;
    private int id;
    private String sitiacao;
    private String imagesUrl;

    public Beneficiario() {
    }

    public Beneficiario(String nome, String cpf, String endereco, String telefone, String solicitacao, int id, String sitiacao, String imagesUrl) {
        super(nome, cpf, endereco, telefone);
        this.setSolicitacao(solicitacao);
        this.setId(id);
        this.setSitiacao(sitiacao);
        this.setImagesUrl(imagesUrl);
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSitiacao() {
        return sitiacao;
    }

    public void setSitiacao(String sitiacao) {
        this.sitiacao = sitiacao;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }
}
