import java.util.Scanner;  // Importe a classe Scanner

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda(2);

        for (int i = 0; i < 2; ++i) {
            System.out.print("Digite o nome: ");
            String nome = in.nextLine();
            System.out.print("Digite a idade: ");
            int idade = in.nextInt();
            in.nextLine();
            System.out.print("Digite o telefone: ");
            long telefone = in.nextLong();
            in.nextLine();
            agenda.add(new Pessoa(nome, idade, telefone));
        }
        in.close();

        agenda.listarPessoas();

        System.out.println("Nome da Pessoa mais nova da agenda: ");
        System.out.println(agenda.getNomeMaisNova());
    }
}