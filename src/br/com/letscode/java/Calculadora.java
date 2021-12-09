package br.com.letscode.java;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numUm;
        int numDois;
        String symbol;

        System.out.println("Digite um número: ");
        numUm = input.nextInt();
        System.out.println("Digite mais um número: ");
        numDois = input.nextInt();
        System.out.println("Digite uma operação: ");
        symbol = input.next();

        switch(symbol){
            case "+":
                System.out.printf("A soma de %d e %d é igual a %d", numUm, numDois,(numUm + numDois));
                break;
            case "-":
                System.out.printf("A subtração de %d e %d é igual a %d", numUm, numDois,(numUm - numDois));
                break;
            case "/":
                System.out.printf("A divisão de %d e %d é igual a %d", numUm, numDois,(numUm / numDois));
                break;
            case "*":
                System.out.printf("A multiplicação de %d e %d é igual a %d", numUm, numDois,(numUm * numDois));
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }
    }
}
