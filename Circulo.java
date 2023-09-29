public class Circulo{
    
    //atributo
    private double raio;

    //Construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    //métodos
    public double calcularArea(){
        return (3.141516 * this.raio * this.raio);
    }

    public double calcularPerimetro(){
        return (2 * 3.141516 * this.raio);
    }
    
    public String imprimir(){
        return "Raio: " + this.raio + " Área: " + this.calcularArea() + " Perimetro: " + this.calcularPerimetro();
     }

}
