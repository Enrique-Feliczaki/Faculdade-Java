package Exercicio9.Atividade3;

public class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir(){
        System.out.println("Relatório");
        System.out.println(conteudo);
    }
}
