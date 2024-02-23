public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitidos;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitidos = 0;

    }

    //METODOS ESPECIAIS

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitidos() {
        return totAssitidos;
    }

    public void setTotAssitidos(int totAssitidos) {
        this.totAssitidos = totAssitidos;
    }

    //METODOS
    public void viuMaisUM(){

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssitidos=" + totAssitidos +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
