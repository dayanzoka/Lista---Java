import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== menu ===");
            System.out.println("1. adicionar produto");
            System.out.println("2. atualizar produto");
            System.out.println("3. remover produto");
            System.out.println("4. exibir relatório de estoque");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarProduto(estoque, scanner);
                    break;
                case 3:
                    removerProduto(estoque, scanner);
                    break;
                case 4:
                    exibirRelatorioEstoque(estoque);
                    break;
                case 0:
                    System.out.println("saindo.");
                    break;
                default:
                    System.out.println("opção inválida. tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarProduto(Estoque estoque, Scanner scanner) {
        System.out.println("informe o código do produto:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("informe o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("informe o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("informe a quantidade do produto:");
        int quantidade = scanner.nextInt();
        estoque.adicionarProduto(codigo, nome, preco, quantidade);
    }

    private static void atualizarProduto(Estoque estoque, Scanner scanner) {
        System.out.println("informe o código do produto a ser atualizado:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("informe o novo nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("informe o novo preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("inoforme a nova quantidade do produto:");
        int quantidade = scanner.nextInt();
        estoque.atualizarProduto(codigo, nome, preco, quantidade);
    }

    private static void removerProduto(Estoque estoque, Scanner scanner) {
        System.out.println("informe o código do produto a ser removido:");
        int codigo = scanner.nextInt();
        estoque.removerProduto(codigo);
    }

    private static void exibirRelatorioEstoque(Estoque estoque) {
        estoque.exibirRelatorioEstoque();
    }
}
