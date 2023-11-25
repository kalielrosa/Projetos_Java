public class FolhaDePagamento {
    private Empregado[] assalariado;
    private int  indice = 0;
    
    public FolhaDePagamento(){
        this.assalariado = new Empregado[5];
    }

    public void adicionarAssalariado(Empregado e){
        if (this.indice < this.assalariado.length){
            this.assalariado[this.indice] = e;
            this.indice++; 
        }
    
    }

    public double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < this.indice; i++){
            total += this.assalariado[i].calcularSalario();
        }
        return total;
    }

    public void imprimirTotal(){
        System.out.printf("Total de Salários Pagos = R$ %.2f ", this.calcularTotal());
    }
}
