//Atributos: +numConta - #tipo (CC 50R$ - CP 150R$) - -dono - -saldo - -status
//Métodos: abrirConta (Muda o status para verdadeiro e falar o tip) - fecharConta (não pode ter dinheiro e nem débito)
//- depositar (status verdadeiro) - sacar (status verdadeiro e ter saldo) - pagamentoMensal (CC 12R$ - CP 20R$)
//Construct: Sempre que uma nova conta for criada o status é falso e saldo = 0
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
    public void abrirConta(String t){
        if (t == "CC"){
            System.out.println("Conta aberta do tipo: " + t);
            setTipo("CC");
            this.saldo = 50f;
            this.status = true;
        }
        else if (t == "CP"){
            System.out.println("Conta aberta do tipo: " + t);
            setTipo("CP");
            this.saldo = 150f;
            this.status = true;
        }
        else {
            System.out.println("Nenhum valor válido informado.");
        }
    }
    public void fecharConta(){
        if (this.saldo != 0){
            System.out.println("A conta não pode ser encerrada.");
        }
        else{
            System.out.println("Conta encerrada.");
            this.status = false;
        }
    }
    public float depositar(float valor){
        if (this.status){
            this.saldo = this.saldo + valor;
        }
        return this.saldo;
    }
    public float sacar(float valor){
        if (this.status) {
            if (valor <= this.saldo) {
                this.saldo = this.saldo - valor;
            } else {
                System.out.println("Valor maior que o saldo informado.");
            }
        }
        return this.saldo;
    }
    public float pagamentoMensal(){
        if (this.tipo == "CC") {
            this.saldo = this.saldo - 12.0f;
        }
        if (this.tipo == "CP") {
            this.saldo = this.saldo - 20.0f;
        }
        return this.saldo;
    }
    public Conta(){
        status = false;
        saldo = 0f;
    }
}
