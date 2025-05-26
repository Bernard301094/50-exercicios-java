/*
Exercício 3: Desenvolva um programa que calcule a área de um retângulo. Peça ao usuário a base e a altura.
*/

package main.java.logica_basica.exercicio03;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("O retângulo com base: " + base + " e altura de: " + altura + " tem uma área de: %.2f" ,
                area);

        scanner.close();
    }
}
