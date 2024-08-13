import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(123, "Matheus", 0.0);
        BusinessAcount bacc = new BusinessAcount(122, "Beatriz", 100.0, 500.0);

        //UPCASTING

        Account acc1 = bacc; //Uma BusinessAcount tambem é uma Account, ent podemos atribuit um obj do tipo bacc para acc1
        System.out.println(acc1.toString());
        Account acc2 = new BusinessAcount(43, "Bob", 0.0, 100.0);
        System.out.println(acc2.toString());
        Account acc3 = new SavingsAccount(10, "Anna", 0.0, 0.01);
        System.out.println(acc3.toString());

        //DOWNCASTING

        //BusinessAcount acc4 = acc2 --> isso não é natural.
        BusinessAcount acc4 = (BusinessAcount)acc2;

        if (acc3 instanceof BusinessAcount){ //FALHA POIS NÃO É INSTANCIA DE BUSINESS ACCOUNT
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(100);
            System.out.println("LOAN!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance(10.0);
            System.out.println("UPDATE!");
        }



    }
}