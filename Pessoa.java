public class Pessoa {
    private String nome;
    private int idade;
    private long telefone;

    public Pessoa(String nome, int idade, long telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getTelefone() {
        return this.telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}