public class Livro implements Publicação {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //METODOS ESPECIAIS

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;


    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa nome)  {
    }

    //METODOS

    public void detalhes(){
        System.out.println("Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", Idade =" + leitor.getIdade() +
                ", leitor=" + leitor.getNome() +
                '}');
    }

    @Override
    public void abrir() {
        if (!this.aberto) {
            this.aberto = true;
        }
        else {
            System.out.println("Livro já está aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto) {
            this.aberto = false;
        }
        else {
            System.out.println("Livro já está fechado.");
        }
    }

    @Override
    public void folhear() {
        System.out.println("Folheando...");
    }

    @Override
    public void avançarPagina() {
        if (this.pagAtual < this.totPaginas){
            this.setPagAtual(getPagAtual()+1);
        }
        else {
            System.out.println("Você ja está na ultima página do livro.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.pagAtual > 0){
            this.setPagAtual(getPagAtual()+1);
        }
        else {
            System.out.println("Você ja está na primeira página do livro.");
        }
    }
}
