package Exercicio2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        CartaoWeb[] mensagem = new CartaoWeb[3];
        mensagem[0] = new DiaDosNamorados("Beatriz");
        mensagem[1] = new Natal("Matheus");
        mensagem[2] = new Aniversario("Lucas");

        for (int i = 0; i < 3; i++) {
            mensagem[i].showMessage();
        }
    }
}
