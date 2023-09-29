public class Porta{
    private String cor;
    private double altura;
    private double largura;
    private boolean estaberto;

    public Porta(String cor, double altura, double largura, boolean estaberto){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaberto = estaberto; 
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura; 
    }

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public boolean getEstaberto(){
        return this.estaberto;
    }

    public void setEstaberto(boolean estaberto){
        this.estaberto = estaberto;
    }

    public String toString(){
        return "Cor: " + this.cor + " Altura: " + this.altura + " Largura: " + this.largura + " Estaberto: " + this.estaberto;
    }
}