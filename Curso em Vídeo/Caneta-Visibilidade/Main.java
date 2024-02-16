public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Vermelho";
        //c1.ponta = 0.5f; // não da pra modificar a 'ponta', pois é privada.
        c1.carga = 100;
        //c1.tampada = true;
        c1.status();
        c1.tampar();
        c1.rabiscar();
    }
}
