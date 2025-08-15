package Atividade5.Atividade3.Atividade1;

public class Main {
    public static void main(String[] args) {
        // Criando produto com construtor vazio e setando dados
        Produto p1 = new Produto();
        p1.setNome("Caneta");
        p1.setPreco(2.50);
        System.out.println("Produto: " + p1.getNome() + " - Preço: R$" + p1.getPreco());

        // Criando produto com construtor com parâmetros (preço válido)
        Produto p2 = new Produto("Caderno", 15.90);
        System.out.println("Produto: " + p2.getNome() + " - Preço: R$" + p2.getPreco());

        // Criando produto com construtor com parâmetros (preço inválido)
        Produto p3 = new Produto("Lápis", -3.00);
        System.out.println("Produto: " + p3.getNome() + " - Preço: R$" + p3.getPreco());
    }
}

