public class Main {
    public static void main(String[] args) {
      
        System.out.println("informe as informações do livro 1:");
        Livro livro1 = Livro.lerLivro();

        System.out.println("\ninforme as informações do livro 2:");
        Livro livro2 = Livro.lerLivro();

        System.out.println("\ninforme as informações do livro 3:");
        Livro livro3 = Livro.lerLivro();

        System.out.println("\ninformações do livro 1:");
        livro1.exibirInfo();

        System.out.println("\ninformações do livro 2:");
        livro2.exibirInfo();

        System.out.println("\ninformações do livro 3:");
        livro3.exibirInfo();
    }
}
