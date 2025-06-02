/*
 Exercício 33: Crie um programa que exiba um menu simples (por exemplo: 1. Greet, 2.) Peça ao usuário para escolher uma opção.
 O programa deve continuar a exibir o menu e a processar a opção até que o usuário escolha a opção 0 (Sair).
 Use um loop while e uma estrutura switch ou if-else if.
*/

package main.java.loops_while.exercicio33;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        int opcaoEscolhida = -1; // Inicializa com um valor diferente de 0 para entrar no loop

        while(opcaoEscolhida != 0) {

            System.out.println("""
            1. Cumprimentar
            2. Mostrar data e hora atual
            3. Calcular a soma de dois números
            0. Sair
            """);

            System.out.println("Escolha uma opção: ");
            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Olá, como você está?");
                System.out.println();

            } else if (opcaoEscolhida == 2) {
                LocalDateTime agora = LocalDateTime.now();
                System.out.println("Data e hora atual: " + agora.format(formato) + "\n");
                System.out.println();

            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o primeiro número: ");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo número: ");
                int num2 = scanner.nextInt();
                System.out.println("A soma é: " + (num1 + num2));
                System.out.println();

            } else if (opcaoEscolhida == 0) {
                System.out.println("Programa encerrado. Até logo!");

            } else {
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
            }
        }
        scanner.close();
    }
}