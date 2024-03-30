import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    
    private List<String> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.println("contato adicionado com sucesso.");
    }

    public void removerContato(String contato) {
        if (contatos.remove(contato)) {
            System.out.println("contato removido com sucesso.");
        } else {
            System.out.println("contato não encontrado na agenda.");
        }
    }

    public void buscarContato(String contato) {
        if (contatos.contains(contato)) {
            System.out.println("contato encontrado na agenda.");
        } else {
            System.out.println("contato não encontrado na agenda.");
        }
    }
}
