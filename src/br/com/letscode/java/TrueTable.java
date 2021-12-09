package br.com.letscode.java;

public class TrueTable {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a: " + (!a));
        System.out.println("b: " + (!b));
        System.out.println("a && b: " + (a && b));
        System.out.println("a && a: " + (a && a));
        System.out.println("b && b: " + (b && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("a || a: " + (a || a));
        System.out.println("b || b: " + (b || b));
    }
}
