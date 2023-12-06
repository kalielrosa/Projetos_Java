
public class Principal {
    public static void main(String[] args){
        
        CadastroFrete cf = new CadastroFrete();
        FretePadrao fp = new FretePadrao(10, 2);
        FreteExpresso fe = new FreteExpresso(5, 6, 1);
        FreteSuperExpresso fs = new FreteSuperExpresso(8, 3, 3, 16);

        cf.add(fp);
        cf.add(fe);
        cf.add(fs);

        double valorTotal = cf.calcularValorTotal();

        System.out.println("Valor total dos fretes cadastrados: R$" + valorTotal);

    
    }
}
