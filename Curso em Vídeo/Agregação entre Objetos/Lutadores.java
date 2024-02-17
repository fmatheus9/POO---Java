public class Lutadores {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //MÉTODOS
    public void apresentar(){
        System.out.println("--------APRESENTAÇÃO--------");
        System.out.println("LUTADOR: " + getNome());
        System.out.println("NACIONALIDADE: " + getNacionalidade());
        System.out.println("IDADE: " + getIdade() + " anos.");
        System.out.println("ALTURA: " + getAltura() + " metros.");
        System.out.println("PESO: " + getPeso()+ "KG");
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("VITORIAS: " + getVitorias());
        System.out.println("DERROTAS: " + getDerrotas());
        System.out.println("EMPATES: " + getEmpates());
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    //MÉTODOS ESPECIAIS

    public Lutadores(java.lang.String nome, java.lang.String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;

    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if(this.peso < 52.2f){
            this.categoria = "INVÁLIDO";
        }
        else if (this.peso <= 70.3f){
            this.categoria = "LEVE";
        }
        else if (this.peso <= 83.9){
            this.categoria = "MÉDIO";
        }
        else if (this.peso <= 120.9){
            this.categoria = "PESADO";
        }
        else {
            this.categoria = "INVÁLIDO";
        }
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}

