public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("carro acelerado. velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("carro freado. velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("o carro já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
