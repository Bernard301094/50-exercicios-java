/*
Exercício 30: Crie um programa que imprima números ímpares de 1 a N.
*/

package main.java.loops_while.exercicio30;

import java.util.Scanner;

public class Impares1a50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para");

        int numero = scanner.nextInt();

        int contador = 0;

        while(contador < numero) {
            contador++;

            if(contador % 2 != 0) {
                System.out.println(contador);
            }
        }
        scanner.close();
    }
}
