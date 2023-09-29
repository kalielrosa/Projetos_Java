public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereço;
    private String telefone;
    private int idade;
    private float salario;

    public Funcionario(int codigo, String nome, String cpf, String endereço, String telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereço(){
        return this.endereço;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String getTeleofone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float calculaSalarioLiquido(){
        float inss = this.salario * 0.11f;
        return this.salario - inss;
    }

    public String imprimir(){
        return "Código: " + this.codigo + " Nome: " + this.nome + " CPF: " + this.cpf + " Endereço: " + this.endereço + " Telefone: " + this.telefone + " Idade: " + this.idade + " Salário: " + this.salario + " Salário Líquido: " + this.calculaSalarioLiquido();
    }

}
