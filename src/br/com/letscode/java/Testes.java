package br.com.letscode.java;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //Declarou o tipo Scanner
//        System.out.println("Informe o peso da primeira pessoa em kg"); //Instrução
//        double peso1 = sc.nextDouble(); //Aqui ele recebe e guarda na var peso um como double
//
//        final float FATOR_CONVERSAO_KG_LB = 2.20462f;
//        System.out.printf("O peso da primeira pessoa em libras é %flb.%n", (peso1 * FATOR_CONVERSAO_KG_LB));


        char[][] jogoDaVelho = new char[3][3];
        char[][] jogoDaVelha = {{'O','X','X'},{'X','O','X'},{'X','X','O'}};

        for (int i=0; i < jogoDaVelha.length; i++) {
            for (int j=0; j < jogoDaVelha[i].length; j++) {
                System.out.println(jogoDaVelha[i][j]);
            }
        }
    }
}
