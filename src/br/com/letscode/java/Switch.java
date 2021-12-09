package br.com.letscode.java;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        int b = new Random().nextInt(7);

        switch (b) {
            case 1:
            case 2:
            case 3:
                System.out.println("Aula");
                break;
            case 4:
            case 5:
                System.out.println("Estudar");
                break;
            default:
                System.out.println("Descansar");
                break;
        }
    }
}
