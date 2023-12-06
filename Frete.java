public abstract class Frete implements Fretavel{
    protected double distancia;
    protected double valorPorKm;

    public Frete(double distancia, double valorPorKm){
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public double getValorPorKm(){
        return this.valorPorKm;
    }
}
