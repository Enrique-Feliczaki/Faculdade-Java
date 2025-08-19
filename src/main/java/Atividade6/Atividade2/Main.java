package Atividade6.Atividade2;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 3, "Azul", true);
        Circulo c = new Circulo(4, "Vermelho", false);

        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Área do Círculo: " + c.calcularArea());
    }
}
