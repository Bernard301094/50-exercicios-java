/*
Exercício 9: Desenvolva um programa que solicite um número de 1 a 7 e exiba o dia da semana correspondente (1 para
domingo, 2 para segunda-feira, etc.).
O programa exibe o dia da semana correspondente (1 para domingo, 2 para segunda-feira, etc.). Considere o uso de
um switch ou uma estrutura if-else if.
*/

package main.java.logica_basica.exercicio09;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("O número digitado deve ser de 1 a 7");
                break;
        }
        scanner.close();
    }
}
