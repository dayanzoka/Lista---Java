import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;
        do {
            System.out.println("\n=== menu ===");
            System.out.println("1. adicionar Contato");
            System.out.println("2. remover Contato");
            System.out.println("3. buscar Contato");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("informe o nome do contato a ser adicionado:");
                    String nomeAdicionar = scanner.nextLine();
                    agenda.adicionarContato(nomeAdicionar);
                    break;
                case 2:
                    System.out.println("informe o nome do contato a ser removido:");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.println("informe o nome do contato a ser buscado:");
                    String nomeBuscar = scanner.nextLine();
                    agenda.buscarContato(nomeBuscar);
                    break;
                case 0:
                    System.out.println("saindo.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
