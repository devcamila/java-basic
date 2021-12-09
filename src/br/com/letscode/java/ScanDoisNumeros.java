package br.com.letscode.java;

import java.util.Scanner;

public class ScanDoisNumeros {
    public static void main(String[] args) {
        int primeiro;
        int segundo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        primeiro = entrada.nextInt();

        System.out.println("Digite mais um número: ");
        segundo = entrada.nextInt();

        int soma = primeiro + segundo;

        System.out.printf("A soma de %d e %d é igual %d!", primeiro, segundo, soma);


    }
}
