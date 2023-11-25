public class Mensalista extends Empregado {
    private double mesesTrabalhados;

    public Mensalista(String nome, String cpf, double salario, double mesesTrabalhados){
        super(nome, cpf, salario);
        this.mesesTrabalhados = mesesTrabalhados;
    }

    public double calcularSalario(){
        return this.salario * this.mesesTrabalhados;
    }
}

