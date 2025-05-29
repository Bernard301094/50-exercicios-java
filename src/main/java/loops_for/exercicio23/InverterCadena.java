/*
Exercício 23: Escreva um programa que inverta uma string inserida pelo usuário usando um loop for.
*/

package main.java.loops_for.exercicio23;

import java.util.Scanner;

public class InverterCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);

            System.out.println(palavraInvertida);
        }
        scanner.close();
    }
}
