package br.com.letscode.java;

public class ConversorLibra {
    public static void main(String[] args) {
        final double constante = 2.20462;
        int kilos = 100;

        var emLibra = kilos * constante;

        System.out.println(String.format("%d Kg equivale a %f lb", kilos, emLibra));
    }
}
