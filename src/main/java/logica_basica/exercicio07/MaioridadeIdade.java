/*
Exercício 7: Escreva um programa que pergunte a idade de um usuário e determine se ele é maior de idade (considerando 18 anos como a idade da maioridade).
*/

package main.java.logica_basica.exercicio07;

import java.util.Scanner;

public class MaioridadeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        scanner.close();
    }
}
