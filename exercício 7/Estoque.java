class Estoque {
    private Object[][] produtos;
    private int tamanho;

    public Estoque() {
        this.produtos = new Object[100][4]; 
        this.tamanho = 0;
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        if (tamanho < produtos.length) {
            produtos[tamanho++] = new Object[]{codigo, nome, preco, quantidade};
            System.out.println("produto adicionado com sucesso!");
        } else {
            System.out.println("limite de produtos atingido. não é possível adicionar mais produtos.");
        }
    }

    public void atualizarProduto(int codigo, String nome, double preco, int quantidade) {
        for (int i = 0; i < tamanho; i++) {
            Object[] produto = produtos[i];
            if ((int) produto[0] == codigo) {
                produto[1] = nome;
                produto[2] = preco;
                produto[3] = quantidade;
                System.out.println("produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("produto não encontrado.");
    }

    public void removerProduto(int codigo) {
        for (int i = 0; i < tamanho; i++) {
            if ((int) produtos[i][0] == codigo) {
                produtos[i] = produtos[tamanho - 1];
                tamanho--;
                System.out.println("produto removido com sucesso!");
                return;
            }
        }
        System.out.println("produto não encontrado.");
    }

    public void exibirRelatorioEstoque() {
        System.out.println("\n=== relatório de estoque ===");
        for (int i = 0; i < tamanho; i++) {
            Object[] produto = produtos[i];
            System.out.println("código: " + produto[0] + " | nome: " + produto[1] +
                    " | preço: " + produto[2] + " | quantidade: " + produto[3]);
        }
    }
}
