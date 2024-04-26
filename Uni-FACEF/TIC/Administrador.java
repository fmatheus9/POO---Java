public class Administrador extends Pessoa{
    private int id;

    public Administrador() {
    }

    public Administrador(String nome, String cpf, String endereco, String telefone, int id) {
        super(nome, cpf, endereco, telefone);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void publicarNoticia(){

    }
}
