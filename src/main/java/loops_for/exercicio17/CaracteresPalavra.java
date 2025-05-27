/*
Exercício 17: Escreva um programa que solicite ao usuário uma palavra e imprima
cada caractere da palavra em uma linha separada usando um loop for.
*/

package main.java.loops_for.exercicio17;

import java.util.Scanner;

public class CaracteresPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            System.out.println(caractere);
            
        }
        scanner.close();
    }
}
