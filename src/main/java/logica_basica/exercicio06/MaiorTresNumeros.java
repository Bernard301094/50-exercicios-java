/*
Exercício 6: Desenvolva um programa que solicite ao usuário três números e determine qual é o maior dos três.
*/

package main.java.logica_basica.exercicio06;

import java.util.Scanner;

public class MaiorTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O primeiro número é o número maior");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O segundo número é o número maior");

        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O terceiro número é o número maior");


        } else {
            System.out.println("Todos os números são iguais");
        }

        scanner.close();
    }
}
