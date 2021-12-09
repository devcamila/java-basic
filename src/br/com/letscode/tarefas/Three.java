package br.com.letscode.tarefas;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double CONST_FATOR_UM = 9.0 / 5.0;
        final double CONST_FATOR_DOIS = 32;
        int celsius;


        System.out.println("Digite uma temperatura em celsius: ");
        celsius = input.nextInt();

        double result = (celsius * CONST_FATOR_UM) + CONST_FATOR_DOIS;
        System.out.printf("A temperatura %d ºC em Fahrenheit é igual a %.2f ºF", celsius, result);
    }
}
