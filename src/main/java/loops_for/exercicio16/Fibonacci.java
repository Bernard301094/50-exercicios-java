/*
Exercício 16: Desenvolva um programa que imprima os primeiros N números da sequência de Fibonacci usando um loop for.
Peça ao usuário o valor de N.
*/

package main.java.loops_for.exercicio16;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de N
        System.out.println("Digite um número para calcular seu Fibonacci: ");
        int numero = scanner.nextInt();

        // Inicializa os dois primeiros números da sequência de Fibonacci
        long anterior1 = 0;
        long anterior2 = 1;

        // Imprime o primeiro número se N >= 1
        if (numero >= 1) {
            System.out.print(anterior1);
        }
        // Imprime o segundo número se N >= 2
        if (numero >= 2) {
            System.out.print(", " + anterior2);
        }

        // Calcula e imprime os próximos números da sequência
        for (int i = 1; i < numero; i++) {
            long fibonacci = anterior1 + anterior2;
            System.out.print(", " + fibonacci);
            anterior1 = anterior2;
            anterior2 = fibonacci;
        }
        scanner.close();
    }
}