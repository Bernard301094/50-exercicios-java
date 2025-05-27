/*
Exercício 15: Crie um programa que calcule o fatorial de um número inteiro positivo
inserido pelo usuário usando um loop for (fatorial de n = 1 * 2 * ... *n).
*/

package main.java.loops_for.exercicio15;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insere um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;

        System.out.println("Calculando " + numero + "!:");

        // Loop que va desde el número hasta 1
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
            if (i == numero) {
                System.out.println(numero + " = " + factorial);
            } else {
                System.out.println(factorial/i + " × " + i + " = " + factorial);
            }
        }

        System.out.println("\nResultado final: " + numero + "! = " + factorial);

        scanner.close();
    }
}