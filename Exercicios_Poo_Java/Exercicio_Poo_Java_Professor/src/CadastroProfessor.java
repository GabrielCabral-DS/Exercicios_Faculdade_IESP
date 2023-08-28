
public class CadastroProfessor {
    //Atributos
    private String nome;
    private String endereco;
    private double salario;
    private int matricula;
    private double horas;

    //Metodo construtor
    public CadastroProfessor(){
        horas = 100;
    }


    //Metodos acessores e modificadores

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}

