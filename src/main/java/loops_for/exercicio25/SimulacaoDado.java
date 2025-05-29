/*
Exercício 25: Desenvolva um programa que simule o lançamento de um dado (números de 1 a 6)
N vezes e conte quantas vezes cada número foi lançado. Peça N ao usuário e use um loop for e Math.random().
*/

package main.java.loops_for.exercicio25;

import java.util.Scanner;

public class SimulacaoDado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas vezes quer jogar um dado?");
        int jogarDado = scanner.nextInt();

        int[] contagem = new int[7]; // índices 1 a 6

        for (int i = 1; i <= jogarDado; i++) {
            int numero = (int) (Math.random() * 6) + 1;
            System.out.println("Face: " + numero);
            contagem[numero]++;
        }

        System.out.println("Resultados da simulação:");
        for (int face = 1; face <= 6; face++) {
            System.out.printf("Face %d: %d vezes%n", face, contagem[face]);
        }

        scanner.close();
    }
}
