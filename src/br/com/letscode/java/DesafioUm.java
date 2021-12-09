package br.com.letscode.java;

public class DesafioUm {
    public static void main(String[] args) {
        double numero = Double.parseDouble(args[0]);

        if (numero % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
    }
}

