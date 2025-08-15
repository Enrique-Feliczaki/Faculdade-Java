package Atividade5.Atividade3.Atividade1;

public class Produto {
    private String nome;
    private Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {
        this.nome = nome;
        if (preco < 0) {
            this.preco = 0.0;
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco < 0) {
            this.preco = 0.0;
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }
}
