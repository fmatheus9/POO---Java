public abstract class Pessoa { //classe abstrata , não pode ser instanciada.
    private String nome;
    private String sexo;
    private int idade;

    public void status() {
        System.out.println("Pessoa: " +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade);
    }

    public void fazerAni(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
