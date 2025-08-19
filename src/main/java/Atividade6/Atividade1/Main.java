package Atividade6.Atividade1;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Carlos", 8500.00, "TI");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário: R$" + g1.getSalario());
        System.out.println("Setor: " + g1.getSetor());
    }
}
