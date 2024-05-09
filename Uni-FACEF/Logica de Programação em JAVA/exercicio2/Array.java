package exercicio2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int [] vet = new int[n]; // declaração do veto, cria um vetor com n elemento informados pelo usuario
            for (int i = 0; i < n; i++) {
                vet[i] = sc.nextInt();
            }
            int soma = 0;
            for (int i = 0; i < n; i++) {
                soma += vet[i];
            }
            System.out.println(soma);
            System.out.println(Arrays.toString(vet));

            sc.close();
        }
}