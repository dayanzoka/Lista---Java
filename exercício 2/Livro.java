import java.util.Scanner;

public class Livro {
   
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public static Livro lerLivro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("informe o nome do autor:");
        String autor = scanner.nextLine();

        System.out.println("informe o ano de publicação:");
        int anoPublicacao = scanner.nextInt();

        return new Livro(titulo, autor, anoPublicacao);
    }
}
