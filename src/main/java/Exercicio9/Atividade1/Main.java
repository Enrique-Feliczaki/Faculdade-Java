package Exercicio9.Atividade1;

public class Main {
    public static void main(String[] args){
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(4,6);

        System.out.println("Área do Circulo é:" + circulo.calcularArea());
        System.out.println("Área do Retangulo é:" + retangulo.calcularArea());
    }
}
