package exercicio5;

public class AlturaClass {
    private String name;
    private float altura;
    private int idade;

    public AlturaClass(String name, float altura, int idade) {
        this.name = name;
        this.altura = altura;
        this.idade = idade;
    }

    public AlturaClass(float altura, int idade) {
        this.altura = altura;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
