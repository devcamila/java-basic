package br.com.letscode.java;

public class TiposPrimitivos {
    public static void main(String[] args) {
        final double raio = 3;
        final double varPi = 3.14;
        double area = raio * raio * Math.PI;
        System.out.println("area um " + area);


        double areaDois = raio * raio * varPi;
        System.out.println("area dois " +areaDois);
    }
}
