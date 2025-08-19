package Atividade5.Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa.getNome());

        System.out.println(pessoa.getIdade());
    }
}
