package br.com.letscode.java;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = 0;
        int contador = 0;

        System.out.println("Digite suas notas: ");
        int newNota = input.nextInt();

        while (newNota >=0 ) {
            if ( newNota <= 10 ) {
                contador++;
                nota += newNota;
                newNota = input.nextInt();
            } else {
                System.out.println("Nota inválida");
                newNota = input.nextInt();
            }
        }
        double media = nota / contador;
        System.out.printf("Sua média é %f", media);

        double[] vetor = new double[]{1, 2};
        System.out.println(vetor[0]);
    }
}
//    Calcule a média aritmética de n valores a serem digitados.
//
//        Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.
//
//        Se o valor digitado for -1, seu programa deve efetuar o cálculo da média e imprimir na tela, com a quantidade de notas
//        digitadas
//
//        Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma.