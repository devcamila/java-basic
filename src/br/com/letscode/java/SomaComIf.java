package br.com.letscode.java;

public class SomaComIf {
    public static void main(String[] args) {

        int number = args.length;

        if ( number == 0) {
            System.out.println("Insira dois números");
        } else if ( number == 2) {
            var soma = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.printf("A soma é %d", soma);
        } else {
            System.err.println("Digite dois números válidos");
        }

    }
}

// 0 pede dos args
// dois soma
// nada error