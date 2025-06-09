/*
 Exercício 40: Desenvolva um programa que simule uma contagem regressiva a partir
 de um número N informado pelo usuário até 0, exibindo cada número na tela.
*/

package main.java.loops_while.exercicio40;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();

        while(numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }
}
