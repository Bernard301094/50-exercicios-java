/*
Exercício 22: Desenvolva um programa que solicite ao usuário 5 números e calcule a média desses números usando um loop for.
*/

package main.java.loops_for.exercicio22;

import java.util.Scanner;

public class PromedioNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números para calcular a média:");

        double [] numeros = new double[5];

        System.out.println("Primeiro número");
        numeros[0] = scanner.nextDouble();

        System.out.println("Segundo número:");
        numeros[1] = scanner.nextDouble();

        System.out.println("Terceiro número:");
        numeros[2] = scanner.nextDouble();

        System.out.println("Quarto número:");
        numeros[3] = scanner.nextDouble();

        System.out.println("Quinto número:");
        numeros[4] = scanner.nextDouble();

        double soma = 0.0;
        double promedio = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            promedio = soma / numeros.length;
        }
        System.out.println("O promedio dos números é: " + promedio);
    }
}
