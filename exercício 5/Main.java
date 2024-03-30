import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("informe o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("informe o ano do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("informe a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("informe a velocidade atual do carro:");
        int velocidadeAtual = scanner.nextInt();

        Carro carro = new Carro(marca, modelo, ano, placa, velocidadeAtual);

        int opcao;
        do {
            System.out.println("\n=== menu ===");
            System.out.println("1. acelerar");
            System.out.println("2. frear");
            System.out.println("3. exibir informações");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    carro.exibirInfo();
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
}
