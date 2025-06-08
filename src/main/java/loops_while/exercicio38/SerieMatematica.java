/*
 Exercício 38: Desenvolva um programa que solicite ao usuário um número inteiro positivo N
 e calcule a soma dos inversos dos números inteiros de 1 até N, ou seja, da série: 1 + 1/2 + 1/3 + ... + 1/N.
*/

package main.java.loops_while.exercicio38;

import java.util.Scanner;

public class SerieMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo N:");
        int numero = scanner.nextInt();

        double soma = 0.0;
        int i = 1;

        while (i <= numero) {
            soma += 1.0 / i;
            if (i < numero) {
                System.out.print (i + " + " + "1/");
            } else {
                System.out.print(i);
            }
            i++;
        }
        scanner.close();
    }
}