/*
 Exercício 39: Crie um programa que leia caracteres do teclado até que o usuário
 digite um ponto ('.'). Conte quantas vogais foram inseridas.
 */

package main.java.loops_while.exercicio39;

import java.util.Scanner;

public class ContarVogaisInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String input;

        while (true) {
            System.out.print("Digite um texto (ou '.' para sair): ");
            input = scanner.nextLine();

            if (input.equals(".")) {
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                char caractere = input.charAt(i);
                if ("aeiouAEIOU".indexOf(caractere) != -1) {
                    contador++;
                }
            }
        }
        System.out.println("Total de vogais digitadas: " + contador);
        scanner.close();
    }
}