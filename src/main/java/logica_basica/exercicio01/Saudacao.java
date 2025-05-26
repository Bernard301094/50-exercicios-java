/*
Exercício 1: Escreva um programa que solicite o nome do usuário e depois o cumprimente pelo nome.
*/

package main.java.logica_basica.exercicio01;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! espero esteja bem");

        scanner.close();
    }
}
