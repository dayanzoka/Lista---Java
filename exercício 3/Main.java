import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("criar conta:");
        ContaBanco conta = ContaBanco.criarConta();

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. depositar");
            System.out.println("2. sacar");
            System.out.println("3. consultar saldo");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.consultarSaldo();
                    break;
                case 0:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("opção inválida. tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
