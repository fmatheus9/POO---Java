public class Video implements AcoesVideo{
    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //METODOS ESPECIAIS


    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        int nova;
        nova = (this.avalicao + avalicao) / this.views;
        this.avalicao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //METODOS
    public void play() {
        this.reproduzindo = true;
    }

    public void pause() {
        this.reproduzindo = false;
    }

    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avalicao=" + avalicao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}
