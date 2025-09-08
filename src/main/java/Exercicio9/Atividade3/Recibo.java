package Exercicio9.Atividade3;

public class Recibo implements Imprimivel{
    private String descricao;
    private double valor;

    public Recibo(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public void imprimir(){
        System.out.println("Recibo");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: R$" + valor);
    }
}
