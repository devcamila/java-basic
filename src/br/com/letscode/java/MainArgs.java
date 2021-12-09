package br.com.letscode.java;

public class MainArgs {
    public static void main(String[] args) {
        //Autoboxing
        Integer wraper = 9;
        System.out.println(wraper);

        //Unboxing
        int unb = 12;
        System.out.println(unb);
        unb = wraper;
        System.out.println(unb);
    }
}
