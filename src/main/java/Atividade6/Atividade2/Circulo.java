package Atividade6.Atividade2;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String cor, boolean preenchida) {
        super(cor, preenchida);
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

