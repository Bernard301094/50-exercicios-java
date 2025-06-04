/*
Exercício 34: Desenvolva um programa que some os dígitos de um número inteiro positivo inserido pelo usuário.
Por exemplo, se o número for 123, a soma será 1+2+3=6.
*/
package main.java.loops_while.exercicio34;

import java.util.Scanner;

public class SomaDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Deve ser positivo.");
            return;
        }

        int soma = 0;
        int temp = numero;

        while (temp > 0) {
            soma += temp % 10;
            temp /= 10;
        }

        System.out.println("Soma dos dígitos de " + numero + " é: " + soma);
        scanner.close();
    }
}
