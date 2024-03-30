import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("soma: " + Calculadora.adicionar(num1, num2));
        System.out.println("subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("multiplicação: " + Calculadora.multiplicar(num1, num2));
        System.out.println("divisão: " + Calculadora.dividir(num1, num2));

        scanner.close();
    }
}

