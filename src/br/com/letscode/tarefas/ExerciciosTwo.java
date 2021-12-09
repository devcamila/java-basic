package br.com.letscode.tarefas;

import java.util.Scanner;

public class ExerciciosTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        System.out.println("Digite um número: ");
        firstNumber = input.nextInt();
        System.out.println("Digite mais um número: ");
        secondNumber = input.nextInt();

        int soma = firstNumber + secondNumber;
        int subtracao = firstNumber - secondNumber;
        int multiplicacao = firstNumber * secondNumber;
        int divisao = firstNumber / secondNumber;

        System.out.printf("A soma é igual a %d. %nA subtração é igual a %d. %nA multiplicação é igual a %d. %nA divisão é igual a %d. %n", soma, subtracao, multiplicacao, divisao);
    }
}
