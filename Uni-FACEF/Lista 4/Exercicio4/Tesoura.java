package Exercicio4;

public class Tesoura extends Coisa{
    @Override
    public String QuemSouEu() {
        return "Pedra";
    }
    @Override
    public void Compara(Coisa c) {
        if (c.QuemSouEu().equals("Tesoura")) {
            System.out.println("Empate");
        }
        else if (c.QuemSouEu().equals("Papel")) {
            System.out.println("Tesoura ganha de Papel");
        }
        else if (c.QuemSouEu().equals("Pedra")) {
            System.out.println("Tesoura perde de Pedra");
        }
        else {
            System.out.println("Valor inválido");
        }
    }
}
