public class Retangulo{
    
    //Atributos 
    private double comprimento;
    private double largura;
    
    //Construtor
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    //Métodos
    public double getcalcularArea(){
        return (this.comprimento * this.largura);
    }

    public double getcalcularPerimetro(){
        return (2 * this.comprimento) + (2 * this.largura);
    }

    public String imprimir(){
        return "Comprimento: " + this.comprimento + " Largura: " + this.largura + " Área: " + this.getcalcularArea() + " Perimetro: " + this.getcalcularPerimetro();
    }
}
