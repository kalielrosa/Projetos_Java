import java.util.ArrayList;
import java.util.List;

public class CadastroFrete {
    private List<Fretavel> fretes;

    public CadastroFrete() {
        this.fretes = new ArrayList<>();
    }

    public void add(Fretavel frete) {
        this.fretes.add(frete);
    }

    public double calcularValorTotal() {
        double Total = 0.0;
        for (Fretavel frete : this.fretes) {
             Total += frete.calcularFrete();
        }
        return Total;
    }

}


