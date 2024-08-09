import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String nome_departamento = scanner.nextLine();

        System.out.println("Entre com os dados do trabalhador: ");

        System.out.print("Nome: ");
        String nome_trabalhador = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Salário base: ");
        double salario_base = scanner.nextDouble();

        //Instancia do objeto Worker - Instancia de workerLevel no valor digitado - Associado a um objeto do tipo departamento.
        Worker worker = new Worker(nome_trabalhador, WorkerLevel.valueOf(workerLevel), salario_base, new Departament(nome_departamento));

        System.out.print("Quantos contratos o trabalhador tem: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Contrato " + (i+1) + ": ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractData = sdf.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valorHora = scanner.nextDouble();
            System.out.print("Duração do contrato: ");
            int hora = scanner.nextInt();
            HourContract contract = new HourContract(contractData, valorHora, hora);

            //associação do contract com o trabalhador.
            worker.addContract(contract);

        }
        System.out.println();
        System.out.print("Entre com mes e ano para calcular o salário: ");
        String monthYear = scanner.next();
        int month = Integer.parseInt(monthYear.substring(0,2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Renda " + monthYear + ": " + worker.income(year, month));
        scanner.close();
    }
}