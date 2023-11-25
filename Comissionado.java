public class Comissionado extends Empregado{
    private double valorVenda;
    private double taxaComissao;

    public Comissionado(String nome, String cpf, double salario, double valorVenda, double taxaComissao){
        super(nome, cpf, salario);
        this.valorVenda = valorVenda;
        this.taxaComissao = taxaComissao;
    }

    public double calcularSalario(){
        return this.salario + (this.taxaComissao * this.valorVenda);
    }
}