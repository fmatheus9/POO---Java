public class Main {
    public static void main(String[] args){
    Lutadores[] l = new Lutadores[6]; //intanciamento da classe lutador
    l[0] = new Lutadores("PrettyBoy", "França", 31,1.75f,68.9f,11,3,4);
    l[1] = new Lutadores("PutScript", "Brasil", 29,1.68f,57.8f,14,2,3);
    l[2] = new Lutadores("Snapshadow", "EUA", 35,1.67f,80.9f,12,2,1);
    l[3] = new Lutadores("DeadCode", "Austrália", 28, 1.98f,81.6f,13,0,2);
    l[4] = new Lutadores("UFOCobol", "Brasil", 34,1.76f,105.0f, 12,3,5);
    l[5] = new Lutadores("Nerdaart", "EUA", 32,1.76f,110.9f,9,2,1);

    luta UEC01 = new luta(); //Instaciamento da classe luta
    UEC01.marcarLuta(l[1],l[0]);
    UEC01.lutar();
    l[1].apresentar();
    l[0].apresentar();

    }

}
