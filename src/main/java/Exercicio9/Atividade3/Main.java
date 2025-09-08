package Exercicio9.Atividade3;

public class Main {
    public static void main(String[] args){
        Imprimivel rel = new Relatorio("aaaaa");
        Imprimivel rec = new Recibo("aaaaaaaaa", 500);
        rel.imprimir();
        rec.imprimir();
    }
}
