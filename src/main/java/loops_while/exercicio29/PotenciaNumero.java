/*
Exercício 29: Escreva um programa que calcule a potência de um número (base
elevado a um expoente) usando um loop while. Peça ao usuário a base e o expoente (número inteiro não negativo).
*/

package main.java.loops_while.exercicio29;

import java.util.Scanner;

public class PotenciaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (número inteiro não negativo): ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (número inteiro não negativo): ");
        int expoente = scanner.nextInt();

        // Validação dos números não negativos
        if (base < 0 || expoente < 0) {
            System.out.println("Erro: Os números devem ser não negativos!");
            scanner.close();
            return;
        }

        // Cálculo da potência usando loop while
        int resultado = 1;
        int contador = 0;

        while (contador < expoente) {
            resultado *= base;
            contador++;
        }

        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}