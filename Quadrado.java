//Criar classe Quadrado
public class Quadrado {

    //atributo
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    //métodos calcularArea
    public double getcalcularArea(){
        return this.lado * this.lado;
    }
    
    //método calcularPerimetro
    public double getcalcularPerimetro(){
        return 4 * this.lado;
    }
    
    //método imprimir
    public String imprimir(){
        return "Lado: " + this.lado + " Área: " + this.getcalcularArea() + " Perimetro: " + this.getcalcularPerimetro(); 
    }
}
