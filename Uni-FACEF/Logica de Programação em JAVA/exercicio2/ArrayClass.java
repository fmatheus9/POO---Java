package exercicio2;

import exercicio2.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de elementos: ");
        int n = sc.nextInt();

        Product[] vet = new Product[n];
        for (int i = 0; i<n; i++){
            System.out.println("Produto " + (i+1));
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            vet[i] = new Product(name, price);
        }
        int soma = 0;
        for (int i = 0; i<n; i++){
            soma += vet[i].getPrice();
        }
        soma = soma / n;
        System.out.println("Average price: $" + soma);


        sc.close();
    }
}
