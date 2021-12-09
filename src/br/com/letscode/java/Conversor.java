package br.com.letscode.java;

public class Conversor {
    public static void main(String[] args) {
        double celsius = 10;
        double num = 9;
        double den = 5;
        final double fator1 = num/den;
        //final double fator1 = 9.0 / 5;
        final double fator2 = 32;

        double fahrenheit = (celsius * fator1) + fator2;

        System.out.println("conversor " + fahrenheit);
        System.out.println(String.format("%f é  ", fahrenheit));

    }
}

