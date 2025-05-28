/*
Exercício 19: Desenvolva um programa que encontre todos os divisores de um número inteiro positivo
inserido pelo usuário usando um loop for.
*/

package main.java.loops_for.exercicio19;

import java.util.Scanner;

public class DivisoresNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i < numero ; i++) {
            if (numero % i == 0) {
                System.out.println("Divisor: " + i);
            }
        }
        scanner.close();
    }
}
