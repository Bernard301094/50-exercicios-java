/*
Exercício 20: Escreva um programa que determine se um número inserido pelo usuário é primo
usando um loop for para verificar seus divisores.
*/

package main.java.loops_for.exercicio20;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(numero + " não é um número primo.");
                break;

            } else {
                System.out.println(numero + " é um número primo.");
                break;
            }
        }

        scanner.close();
    }

}
