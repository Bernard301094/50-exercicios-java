/*
Exercício 21: Crie um programa que some todos os números ímpares entre 1 e um número N inserido pelo usuário, usando um loop for.
*/

package main.java.loops_for.exercicio21;

import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");

        int numero = scanner.nextInt();
        int impar = 1;
        int somaImpares = 0;

        System.out.println("Números ímpares entre 1 e " + numero + ":");
        for (int i = impar; i < numero; i++) {
            if (i % 2 == 1) {
                somaImpares += i;

                System.out.println("Número ímpar: " + i);
            }
        }

        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}
