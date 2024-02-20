public class Bolsista extends Aluno{
    private int bolsa;
    public void renovarBolsa(){
        System.out.println("Bolsa renovada." + this.getNome());
    }
    @Override //SOBREPOSIÇÃO
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga do bolsista " + this.getNome());
    }
}
