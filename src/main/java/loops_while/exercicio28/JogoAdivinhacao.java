/*
 Exercício 28: Desenvolva um programa que simule um jogo de adivinhação de números.
 Gere um número aleatório entre 1 e 100 e peça ao usuário para adivinhar o número.
 Se o usuário adivinhar incorretamente, diga-lhe se o número secreto é maior ou menor.
 Continue pedindo mais tentativas até que o usuário adivinhe corretamente.
*/

package main.java.loops_while.exercicio28;

import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100. Tente adivinhar qual é!");
        int numeroSecreto = (int) (Math.random() * 100) + 1;

        int tentativa = 1;
        System.out.println("Digite seu palpite:");
        int palpite = scanner.nextInt();

        while (palpite != numeroSecreto) {
            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor que " + palpite + ".");
            } else {
                System.out.println("O número secreto é maior que " + palpite + ".");
            }
            tentativa++;
            System.out.println("Tente novamente:");
            palpite = scanner.nextInt();
        }

        System.out.println("Parabéns! Você adivinhou o número secreto em " + tentativa + " tentativas.");
        scanner.close();
    }
}