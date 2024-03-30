
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private List<Pizza> pizzas;
    private double total;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        total += pizza.getValor();
        System.out.println("pizza adicionada ao pedido: " + pizza.getNome());
    }

    public void cancelarPedido() {
        pizzas.clear();
        total = 0.0;
        System.out.println("pedido cancelado com sucesso.");
    }

    public void exibirRelatorio() {
        System.out.println("=== relatório de pedido ===");
        System.out.println("total de pizzas: " + pizzas.size());
        System.out.println("valor total: R$" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        Pizza margherita = new Pizza("Margherita", 25.00);
        margherita.adicionarIngrediente("molho de tomate");
        margherita.adicionarIngrediente("mussarela");
        margherita.adicionarIngrediente("manjericão");

        Pizza calabresa = new Pizza("Calabresa", 30.00);
        calabresa.adicionarIngrediente("molho de tomate");
        calabresa.adicionarIngrediente("calabresa");
        calabresa.adicionarIngrediente("mussarela");

        Pizza quatroQueijos = new Pizza("quatro queijos", 35.00);
        quatroQueijos.adicionarIngrediente("molho de tomate");
        quatroQueijos.adicionarIngrediente("mussarela");
        quatroQueijos.adicionarIngrediente("parmesão");
        quatroQueijos.adicionarIngrediente("gorgonzola");
        quatroQueijos.adicionarIngrediente("provolone");

        System.out.println("bem-vindo à pizzaria!");
        int opcao;
        do {
            System.out.println("\n=== menu ===");
            System.out.println("1. adicionar Pizza ao pedido");
            System.out.println("2. cancelar Pedido");
            System.out.println("3. exibir eelatório do pedido");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarPizzaAoPedido(scanner, pedido, margherita, calabresa, quatroQueijos);
                    break;
                case 2:
                    pedido.cancelarPedido();
                    break;
                case 3:
                    pedido.exibirRelatorio();
                    break;
                case 0:
                    System.out.println("obrigado por escolher a pizzaria!");
                    break;
                default:
                    System.out.println("opção inválida. tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarPizzaAoPedido(Scanner scanner, Pedido pedido, Pizza... pizzas) {
        System.out.println("escolha uma pizza:");
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println((i + 1) + ". " + pizzas[i].getNome() + " - R$" + pizzas[i].getValor());
        }
        System.out.print("digite o número da pizza desejada: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); 

        if (escolha >= 1 && escolha <= pizzas.length) {
            pedido.adicionarPizza(pizzas[escolha - 1]);
        } else {
            System.out.println("opção inválida. pizza não adicionada ao pedido.");
        }
    }
}
