/* 
Deve haver um método para que um programa "fora" da classe descubra o título da fita e o
 preço do aluguel por dia. 
Além do mais, deve haver um método público getValorAluguel(int numeroDeDiasAlugada) 
que retorne o valor do aluguel desta fita se ela for alugada em um certo número de dias 
(este número de dias é passado como parâmetro). Faça também o método toString(),
 para retornar a versão textual do objeto.
Escreva uma classe principal, onde você deve criar algumas fitas e mostrar os dados de cada uma.
 */
public class Fitas{

    //atributos
    private String titulo;
    private double preçoAluguelPorDia;

    //construtor
    public Fitas(String titulo, double preçoAluguelPorDia){
        this.titulo = titulo;
        this.preçoAluguelPorDia = preçoAluguelPorDia;
    }

    //métodos
    public String getTitulo(){
        return this.titulo;
    }

    public double getPreçoAluguelPorDia(){
        return this.preçoAluguelPorDia;
    }

    public String toString(){
        return "Título: " + this.getTitulo() + " Preço do Aluguel Por Dia: " + this.getPreçoAluguelPorDia();
    }

}
