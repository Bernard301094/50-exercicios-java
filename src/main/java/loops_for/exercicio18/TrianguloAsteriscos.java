/*
Exercício 18: Crie um programa que imprima um padrão de asteriscos no formato de um triângulo retângulo,
como o seguinte (para N=5): * **
*/

package main.java.loops_for.exercicio18;

import java.util.Scanner;

public class TrianguloAsteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N (altura do triângulo): ");
        int n = scanner.nextInt();
        String asterisco = "*";


        for (int i = 0; i < n; i++) {
            System.out.println(asterisco);
            asterisco+= "*"; // Adiciona um asterisco a cada iteração
        }

        scanner.close();
    }
}
