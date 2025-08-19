package Atividade6.Atividade2;


public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor, boolean preenchida) {
        super(cor, preenchida);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}

