public class FreteExpresso extends Frete {
    protected int nivelUrgencia;

    public FreteExpresso(double distancia, double valorPorKm, int nivelUrgencia) {
        super(distancia, valorPorKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    public int nivelUrgencia(){
        return this.nivelUrgencia;
    }

    @Override
    public double calcularFrete() {
        return (this.distancia * this.valorPorKm) + (this.nivelUrgencia * 100);
    }
}

