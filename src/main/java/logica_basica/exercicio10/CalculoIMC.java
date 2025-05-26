/*
Exercício 10: Escreva um programa que calcule o Índice de Massa Corporal (IMC) de uma pessoa.
Peça ao usuário o peso em quilogramas e a altura em metros (IMC = peso / altura^2).
*/

package main.java.logica_basica.exercicio10;

import java.util.Scanner;

public class CalculoIMC {

    public void calcularIMC() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Qual a sua altura em metros?");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("O IMC é: %.2f", imc);
    }

    public static void main(String[] args) {
        CalculoIMC imc = new CalculoIMC();
        imc.calcularIMC();
    }
}
