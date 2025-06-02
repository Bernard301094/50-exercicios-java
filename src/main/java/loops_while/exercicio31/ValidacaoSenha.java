/*
Exercício 31: Desenvolva um programa que valide uma senha inserida pelo usuário.usuário. A senha correta é "secret123".
Enquanto o usuário não digitar a senha correta, o programa continuará solicitando-a.
*/

package main.java.loops_while.exercicio31;

import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String senhaCorreta = "secret123";

        System.out.println("Digite a senha: ");
        String senhaInformada = scanner .nextLine();

        while (!senhaInformada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.println("Digite a senha: ");
            senhaInformada = scanner.nextLine();
        }

        if (senhaInformada.equals(senhaCorreta)) {
            System.out.println("Senha correta! Acesso concedido.");
        }

    }
}