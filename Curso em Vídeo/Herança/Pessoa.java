public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void status() {
        System.out.println("Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}');
    }

    //METODOS
    public void fazerAniverssario(){
        this.idade ++;
    }
}
