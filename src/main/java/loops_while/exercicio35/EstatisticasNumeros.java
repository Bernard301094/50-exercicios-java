/*
Exercício 35: Escreva um programa que leia números inteiros até que um 0 seja inserido.
No final, ele deve mostrar quantos números foram inseridos (sem contar o 0), a soma total e a média.
*/

package main.java.loops_while.exercicio35;

import java.util.Scanner;

public class EstatisticasNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro (0 para sair):");
        int numero = scanner.nextInt();
        int numeroAnterior;
        int contador = 0;
        int soma = 0;
        int media = 0;

        while (numero != 0) {
            System.out.println("Você digitou: " + numero);
            contador++;
            numeroAnterior = numero;
            soma += numero;
            media = soma / contador;

            if (numero > 0) {
                System.out.println("Digite outro número inteiro (0 para sair):");
                numero = scanner.nextInt();
            } else {
                System.out.println("Número inválido. Por favor, digite um número inteiro positivo ou 0 para sair.");
                numero = scanner.nextInt();
            }
        }

        System.out.println("Total de números inseridos: " + contador);
        System.out.println("Soma total: " + soma);
        System.out.println("Média: " + media);
        scanner.close();
    }
}
