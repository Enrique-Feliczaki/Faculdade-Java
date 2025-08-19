package Atividade6.Atividade1;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente() {}

    public Gerente(String nome, Double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
