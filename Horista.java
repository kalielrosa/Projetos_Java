public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String cpf, float salario, double precoHora, double horasTrabalhadas){
        super(nome, cpf, salario);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return this.salario + (this.precoHora * this.horasTrabalhadas);
    }
}
