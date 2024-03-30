import java.util.Scanner;

public class ContaBanco {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBanco(String numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("saldo insuficiente para efetuar o saque.");
        } else {
            saldo -= valor;
            System.out.println("saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void consultarSaldo() {
        System.out.println("saldo atual: R$" + saldo);
    }

    public static ContaBanco criarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("informe o nome do titular:");
        String nomeTitular = scanner.nextLine();

        System.out.println("informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        return new ContaBanco(numeroConta, nomeTitular, saldoInicial);
    }
}
