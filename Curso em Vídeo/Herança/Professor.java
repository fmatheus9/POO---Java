public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    //METODOS
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    //METODOS ESPECIAIS

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
