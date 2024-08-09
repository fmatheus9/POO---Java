package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
     private String name;
     private WorkerLevel level;
     private Double baseSalary;
     private Departament departament;
     private List<HourContract> contracts = new ArrayList<>(); //uma lista não é incluina no contrutor

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    //adicionar um contrato na lista
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double soma = baseSalary;
        Calendar cal1 = Calendar.getInstance();
        for (HourContract c: contracts){
            cal1.setTime(c.getDate());
            int c_year = cal1.get(Calendar.YEAR);
            int c_month = cal1.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                soma += c.totalValue();
            }
        }
        return soma;
    }


}
