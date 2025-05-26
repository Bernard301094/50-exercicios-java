/*
Exercício 5: Crie um programa que determine se um número inserido pelo usuário é par ou ímpar.
*/

package main.java.logica_basica.exercicio05;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é ímpar");
        }

        scanner.close();
    }
}
