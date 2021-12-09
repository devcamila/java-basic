package br.com.letscode.java;

import java.time.LocalDateTime;

public class ImprimirDate {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        System.out.printf("Hoje é %tA %n", date);
        System.out.printf("Hoje é dia %te %n", date);
        System.out.printf("Do mês de %tB %n", date);
        System.out.printf("Do ano de %ty %n", date);
        System.out.printf("São %tH horas %n", date);
        System.out.printf("São %tM minutos", date);


    }
}
