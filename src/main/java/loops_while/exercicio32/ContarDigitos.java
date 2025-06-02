/*
Exercício 32: Escreva um programa que conte quantos dígitos tem um número inteiro positivo inserido pelo usuário.
Use um loop while (dividindo o número por 10 repetidamente).
*/

package main.java.loops_while.exercicio32;

import java.util.Scanner;

public class ContarDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");

        int numero = scanner.nextInt();
        int divisor = 10;
        int valor = 0;
        int contador = 0;


        while (numero > 0) {

            valor = numero / divisor;
            System.out.println(numero + " / " + divisor + " = " + valor);
            numero = valor;
            contador++;

        }
        scanner.close();
        System.out.println("Quantidade de dígitos: " + contador);
    }
}
