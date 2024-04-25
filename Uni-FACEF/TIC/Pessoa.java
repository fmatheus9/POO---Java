public class Pessoa implements PessoaInterface{
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco, String telefone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void buscar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void deletar() {

    }
}
