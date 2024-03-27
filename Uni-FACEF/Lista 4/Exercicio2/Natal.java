package Exercicio2;

public class Natal extends CartaoWeb{
    public Natal() {
    }

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, " + this.destinatario);
    }
}
