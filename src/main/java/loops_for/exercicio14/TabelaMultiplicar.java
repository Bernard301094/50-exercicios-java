/*
Exercício 14: Escreva um programa que solicite ao usuário um número inteiro positivo e imprima sua tabela de multiplicação de 1 a 10.
*/

package main.java.loops_for.exercicio14;

import java.util.Scanner;

public class TabelaMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo para imprimir sua tabela de multiplicação até o 10: ");
        int numeroDigitado = scanner.nextInt();
        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " x " + i + " = " + resultado);

        }
    }
}
