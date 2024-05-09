package exercicio4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int []vet = new int[n];
        float soma = 0;
        for (int i = 0; i < n ; i++){
            vet[i] = sc.nextInt();
            soma =+ vet[i];
        }
        float media = soma /n;

        System.out.println(Arrays.toString(vet));

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        sc.close();
    }
}
