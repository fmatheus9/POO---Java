package Exercicio2;

public class Aniversario extends CartaoWeb{
    public Aniversario() {
    }

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniverssário, " +this.destinatario);
    }
}
