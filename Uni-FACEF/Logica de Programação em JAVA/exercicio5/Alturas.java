package exercicio5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores serão inseridos no vetor: ");
        int n = sc.nextInt();
        AlturaClass[] vet = new AlturaClass[n];

        float media = 0;
        float porcentagem = 0;


        for (int i = 0; i< n; i++){
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            int altura = sc.nextInt();
            vet[i] = new AlturaClass(name, idade, altura);
            media += altura;
            if (idade < 16){
                porcentagem += 1;

            }
        }

        porcentagem =  (porcentagem /n *100);
        media = media/n;

        System.out.println("Media das alturas: " + media);
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagem);

        sc.close();
    }
}
