public class Calculadora {
    
    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("erro: divisão por zero!");
            return Double.NaN; 
        } else {
            return num1 / num2;
        }
    }
}
