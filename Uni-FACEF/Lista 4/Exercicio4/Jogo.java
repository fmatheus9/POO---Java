package Exercicio4;

import javax.swing.*;
import java.util.Random;

public class Jogo {
    public static void main(String[] args){
        String user = JOptionPane.showInputDialog("Digite 1: Papel\nDigite 2: Pedra\nDigite 3: Tesoura");
        Coisa escolhaUsuario;
        switch (user){
            case "1": escolhaUsuario = new Papel(); break;
            case "2": escolhaUsuario = new Pedra(); break;
            case "3": escolhaUsuario = new Tesoura(); break;
            default: escolhaUsuario = new Pedra();
                System.out.println("Escolha inválida. Você jogará com Papel.");
        }

        //ESCOLHA DO PC
        Coisa escolhaPC;
        Random random = new Random();
        int num = random.nextInt(1,3);
        if (num == 1){
            System.out.println("Pc escolha Papel");
            escolhaPC = new Papel();

        } else if (num == 2) {
            System.out.println("Pc escolha Pedra");
            escolhaPC = new Pedra();

        }
        else {
            System.out.println("Pc escolha Tesoura");
            escolhaPC = new Tesoura();

        }
        escolhaUsuario.Compara(escolhaPC); //O objeto polimórfico é o escolhaUsuário
    }
}
