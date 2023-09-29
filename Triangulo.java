//Criar classe
public class Triangulo{
    
    //Atributos
    private double base;
    private double altura;

    //Construtor
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    public double getcalcularArea(){
        return this.base * this.altura / 2;
    }

    public String imprimir(){
        return "Base: " + this.base + " Altura: " + this.altura + " Área: " + this.getcalcularArea();
    }
}
