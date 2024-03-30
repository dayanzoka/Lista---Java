import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public Pizza(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }
}
