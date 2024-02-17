import java.util.Objects;
import java.util.Random;
public class luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    //MÉTODOS ESPECIAIS

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //MÈTODOS

    public void marcarLuta(Lutadores l1, Lutadores l2){
        if(Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0: //empate
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                case 1: //vitoria desafiado
                    System.out.println("VITORIA DO DESAFIADO! " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                case 2: //vitoria desafiante
                    System.out.println("VITORIA DO DESAFIANTE! " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
            }
        }
        else {
            System.out.println("Luta não pode acontecer.");
        }
    }
}
