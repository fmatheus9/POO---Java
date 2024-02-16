public class Controle implements InterfaceControle {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //MÉTODOS ESPECIAIS
    public Controle(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    private int getVolume(){
        return volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    //MÉTODOS ABSTRATOS
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("LIGADO: " + this.getLigado());
        System.out.println("TOCANDO: " + this.getTocando());
        System.out.print("VOLUME: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i +=10){
            System.out.print("+");
        }
    }
    public void fecharMenu(){
        System.out.println("FECHANDO MENU.");
    }
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(getVolume() - 1);
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0 ){
            this.setVolume(50);
        }
    }
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
