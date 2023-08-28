public class Cadastro {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private  float saldo;
    private  boolean status;

    //Método Construtor

    public Cadastro(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    // Métodos acessores e modificadores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos Personalizados

    public void abrirConta(String t){

    }

    public void fecharConta(){

    }

    public void depositar(float v){

    }
    public void sacar(float v){

    }
    public void pagarMensal(){

    }
}
