public class Funcionario extends Pessoa{
    private String areaAtuacao;
    private String login;
    private String senha;
    private String permissoesAcesso;
    private boolean isAdimin;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String endereco, String telefone, String areaAtuacao, String login, String senha, String permissoesAcesso, boolean isAdimin) {
        super(nome, cpf, endereco, telefone);
        this.setAreaAtuacao(areaAtuacao);
        this.setLogin(login);
        this.setSenha(senha);
        this.setPermissoesAcesso(permissoesAcesso);
        this.setAdimin(isAdimin);
    }

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

    public String getPermissoesAcesso() {
        return permissoesAcesso;
    }

    public void setPermissoesAcesso(String permissoesAcesso) {
        this.permissoesAcesso = permissoesAcesso;
    }

    public boolean isAdimin() {
        return isAdimin;
    }

    public void setAdimin(boolean adimin) {
        isAdimin = adimin;
    }
}
