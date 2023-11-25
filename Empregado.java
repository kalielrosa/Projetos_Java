public abstract class Empregado extends Assalariado{
    private String nome;
    private String cpf;
    protected double salario;

    public Empregado(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String GetNome(){
        return this.nome;
    }

    public String GetCpf(){
        return this.cpf;
    }

    public double GetSalario(){
        return this.salario;
    }
}


