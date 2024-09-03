import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criando uma lista do tipo Product para instanciar os produtos
        List<Product> list = new ArrayList<>();

        //entrada de dados com o path do arquivo a ser lido
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        //O arquivo é instanciado como uma classe file
        File sourceFile = new File(sourceFileStr);
        //Recuperamos a pasta em que o arquivo esta
        String sourceFolderStr = sourceFile.getParent();

        //Criamos outra pasta dentro desse arquivo
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        //Criamos o aquivo a ser escrito dentro da pasta criada anteriormente
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        //Le o arquivo passado pelo usuário
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            //Le o arquivo passado pelo usuário de linha em linha
            String itemCsv = br.readLine();
            while (itemCsv != null) {

                //Separa a linha onde tem ',' e adiciona a um array do tipo String os valores recuperados na linha
                String[] fields = itemCsv.split(",");

                //os valores são transferidos para variaveis e instanciados na Classe Product
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            //Escrever em um novo arquivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                //Para cada produto na lista:
                for (Product item : list) {
                    //Escreve em uma linha o nome + , + total
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                //Mensagem avisando que o novo arquivo foi criado
                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}