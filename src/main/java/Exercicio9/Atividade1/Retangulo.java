package Exercicio9.Atividade1;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private  double altura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public double calcularArea(){
        return  largura * altura;
    }
}
