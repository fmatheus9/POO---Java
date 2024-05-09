package exercicio3;

import java.util.Locale;
import java.util.Scanner;
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int []vet = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Digite um valor: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < n; i++){
            if (vet[i]< 0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
