package Exercicio9.Atividade2;

public class Administrador implements  Autenticavel {
    private String usuario;
    private  String senha;

    public Administrador(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }
}
