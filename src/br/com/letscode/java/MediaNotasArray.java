package br.com.letscode.java;

import java.util.Random;
import java.util.Scanner;

public class MediaNotasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAlunos;
        double notaMedia = 0;

        System.out.println("Digite o número de alunos: ");
        numeroAlunos = input.nextInt();
        int[] notasTurma = new int[numeroAlunos];

        for (int i = 0; i < notasTurma.length; i++) {
            notasTurma[i] = new Random().nextInt(10);
            System.out.println(notasTurma[i]);
        }

        for (int nota:notasTurma) {
            notaMedia += nota;
        }

        System.out.printf("A nota média é %.2f %n", (notaMedia/notasTurma.length));
        System.out.printf("O total de alunos é %d %n", numeroAlunos);

        input.close();
    }
}


//    Calcular a média de notas de uma turma com n alunos. O valor n deve ser solicitado via System.in. Deve-se criar um vetor
//        para armazenar a nota de todos os alunos. Ao final o programa deve imprimir a nota média e também a quantidade de
//        alunos. Obs.: Utilize um for para obter as notas de cada aluno e um foreach para fazer o cálculo da média