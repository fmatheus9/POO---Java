public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void status(){
        System.out.println("Modelo: " + this.modelo); //this é o nome do objeto que chamou, nesse caso o 'c1'.
        System.out.println("Cor: " + this.cor); //this é uma referência ao proprio objeto que chamou.
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada: " + this.tampa);
    }
    void rabiscar(){
        if (this.tampa == true){
            System.out.println("Erro! Não posso rabiscar com a tampa fechada");
        }
        else{
            System.out.println("Estou rabiscando! :)");
        }
    }
    void tampar(){
        this.tampa = true;
    }
    void destampar(){
        this.tampa = false;
    }
}
