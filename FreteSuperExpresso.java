public class FreteSuperExpresso extends FreteExpresso {
    private double valorDoSeguro;

    public FreteSuperExpresso(double distancia, double valorPorKm, int nivelUrgencia, double valorDoSeguro) {
        super(distancia, valorPorKm, nivelUrgencia);
        this.valorDoSeguro = valorDoSeguro;
    }

    public double valorDoSeguro(){
        return this.valorDoSeguro;
    }
    
    @Override
    public double calcularFrete() {
        return  (this.distancia * this.valorPorKm) + (this.nivelUrgencia * 100) + this.valorDoSeguro;
    }
}
