public class Professor extends Pessoa{
    private float salario;
    private String especialidade;

    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
