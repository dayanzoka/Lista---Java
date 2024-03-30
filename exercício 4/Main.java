import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("informe sua pontuação inicial:");
        int pontuacao = scanner.nextInt();

        System.out.println("informe o nível inicial:");
        int nivel = scanner.nextInt();

        Jogador jogador1 = new Jogador(nome, pontuacao, nivel);

        System.out.println("informe a quantidade de pontos para aumentar a pontuação:");
        int pontos = scanner.nextInt();
        jogador1.aumentarPontuacao(pontos);

        System.out.println("deseja subir de nível? (S/N)");
        scanner.nextLine(); 
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            jogador1.subirNivel();
        }

        System.out.println("\ninformações do jogador:");
        jogador1.exibirInfo();

        scanner.close();
    }
}
