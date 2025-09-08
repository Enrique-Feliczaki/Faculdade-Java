package Exercicio9.Atividade2;

public class Main {
    public static void main(String[]args){
        Autenticavel user = new Usuario("SapoBoi", "12345");
        Autenticavel administrador = new Administrador("Admin", "admin");

        System.out.println("Usuário autenticado:" + user.autenticar("12345"));
        System.out.println("Administrador autenticado: "+ administrador.autenticar("admin"));
    }
}
