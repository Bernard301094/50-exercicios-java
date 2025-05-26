/*
Exercício 2: Crie um programa que solicite ao usuário dois números inteiros e exiba sua adição, subtração, multiplicação e divisão. Certifique-se de lidar com a divisão por zero.
*/

package main.java.logica_basica.exercicio02;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.println("Agora digite outro número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
            System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
            System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
            System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));

        } catch (ArithmeticException e) {
            System.out.println("\u001B[31mErro: divisão por zero não é permitida.\u001B[0m");

        } finally {
            scanner.close();
        }
    }
}
