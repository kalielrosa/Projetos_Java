public class Agenda {
    private Pessoa[] pessoas;
    private int qtde;

    public Agenda(int capacidade) {
        this.qtde = 0;
        this.pessoas = new Pessoa[capacidade];
    }

    public boolean add(Pessoa p) {
        if (this.qtde == this.pessoas.length) {
            return false;
        }
        this.pessoas[this.qtde++] = p;
        return true;
    }

    public void listarPessoas() {
        System.out.println("Lista de Pessoas na Agenda:");
        for (int i = 0; i < this.qtde; i++) {
            Pessoa pessoa = this.pessoas[i];
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println();
        }
    }

    public String getNomeMaisNova() {
        if (this.qtde == 0) {
            return null;
        }
        Pessoa menor = this.pessoas[0]; // referência a primeira pessoa e amazena
        for (Pessoa p : this.pessoas) {
            if (p.getIdade() < menor.getIdade()) {
                menor = p;
            }
        }
        return menor.getNome();
    }
}
