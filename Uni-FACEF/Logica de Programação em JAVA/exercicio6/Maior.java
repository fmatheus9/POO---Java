package exercicio6;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).


import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números inseridos: ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < n; i ++){
            vet[i] = sc.nextInt();
        }

        int posicao = 0;
        int maior = vet[0];
        for (int i = 0; i < n; i ++){
            if (vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição: " + posicao);
        sc.close();
    }
}
