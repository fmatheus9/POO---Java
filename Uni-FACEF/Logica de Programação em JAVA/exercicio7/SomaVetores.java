package exercicio7;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números inseridos nos vetores: ");
        int n = sc.nextInt();

        int [] vet1 = new int[n];
        int [] vet2 = new int[n];
        int [] vet3 = new int[n];

        System.out.println("Vetor 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Insira o valor " + (i+1) + ": ");
            vet1[i] = sc.nextInt();
        }
        System.out.println("Vetor 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Insira o valor " + (i+1) + ": ");
            vet2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }

        System.out.println("Soma dos vetores: ");
        System.out.println(Arrays.toString(vet3));

        sc.close();
    }
}
