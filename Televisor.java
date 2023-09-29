public class Televisor{
    private double canal;
    private int volume;
    private boolean ligado;

    public Televisor(double canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void aumentarVolume(){
        if (this.volume < 100){
            this.volume = this.volume +1;
        }
    }
    public void diminuirVolume(){
        if (this.volume > 0){
            this.volume = this.volume - 1;
        }
    }
    
    public void trocarCanal(double canal2){
        if ( this.canal < 100){
            this.canal = this.canal + 1;
        }
    }

    public String toString(){
      /*   String ligado = "Não";
        if (this.ligado == true){
            ligado = "Sim";
        }*/
        return "Canal: " + this.canal + " Volume: " + this.volume + " Ligado: " + this.ligado;
    }

    public void trocarCanal() {
    }
}
