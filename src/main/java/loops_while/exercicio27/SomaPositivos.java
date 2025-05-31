/*
Exercício 27: Crie um programa que solicite que o usuário digite números positivos.
O programa deve ser encerrado quando o usuário digitar um número negativo e, no final, deve exibir a soma de todos os números positivos digitados.
*/

package main.java.loops_while.exercicio27;

import java.util.Scanner;

public class SomaPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números inteiros positivos (digite um número negativo para encerrar)");
        int numero = 0;
        int soma = 0;

        while (numero >= 0) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();

            System.out.println("Você digitou: " + numero + "\n");
            soma += numero;

            if (numero < 0) {
                System.out.println("Número negativo digitado, encerrando o programa...");
                soma -= numero; // Remove o número negativo da soma
                System.out.println("Soma dos números positivos digitados: " + soma);
                scanner.close();
            }
        }
    }
}
