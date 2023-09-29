
public class Calendario {
    private int dia, mes, ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String nomeMes(int m){
            if (m == 1){
                return "janeiro";
        }
            else if(m == 2){
                return "fevereiro";
        }
            else if(m == 3){
                return "março";
        }
            else if(m == 4){
                return "abril";
        }
            else if(m == 5){
                return "maio";
        }
            else if(m == 6){
                return "junho";
        }
            else if(m == 7){
                return "julho";
        }
            else if(m == 8){
                return "agosto";
        }
            else if(m == 9){
                return "setembro";
        }
            else if(m == 10){
                return "outobro";
        }
            else if(m == 11){
                return "novembro";
            }
            else if(m == 12){
                return "dezembro";
        }
    
    return "Opção Iválida";
    }
    
    public void mostraData(){
        System.out.println(this.dia + " de " + this.nomeMes(this.mes) + " de " + this.ano);
    }

    public void anoBissexto(){
        if (this.ano % 4 == 0){
            System.out.println("Bissexto");
        }
        else if(this.ano % 4 != 0){
            System.out.println("Não é Bissexto");
        }
    }
}



