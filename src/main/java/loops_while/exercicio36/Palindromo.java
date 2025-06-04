/*
    Exercício 36: Crie um programa que determine se um número inserido pelo usuário é um palíndromo
    (lê o mesmo da esquerda para a direita e da direita para a direita).
    O número digitado pelo usuário é um palíndromo (lê o mesmo da esquerda para a direita e da direita para a esquerda, por exemplo, 121).
    esquerda, por exemplo, 121).
*/

package main.java.loops_while.exercicio36;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int original = numero;
            int invertido = 0;

            // Inverte o número usando operações matemáticas
            while (numero > 0) {
                invertido = invertido * 10 + numero % 10;
                numero /= 10;
            }

            if (original == invertido) {
                System.out.println("O número " + original + " é um palíndromo.");
            } else {
                System.out.println("O número " + original + " não é um palíndromo.");
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            scanner.nextLine(); // Limpa o buffer
            if (!scanner.nextLine().equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }
}