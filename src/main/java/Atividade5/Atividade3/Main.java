package Atividade5.Atividade3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();

        pessoas.add("Gabriel");
        pessoas.add("Quevedo");
        pessoas.add("Haelyton");
        pessoas.add("Enrique");
        pessoas.add("Gustavo");

        Random random = new Random();
        int randomIndex = random.nextInt(pessoas.size());
        String randomElement = pessoas.get(randomIndex);

        System.out.println(randomElement);
    }
}
