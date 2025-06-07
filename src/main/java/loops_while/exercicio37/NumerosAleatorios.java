/*
 Exercício 37: Desenvolva um programa que gere números aleatórios entre 1 e 10 até que gere um 7. Conte quantos
 números foram gerados antes de obter o 7.
*/

package main.java.loops_while.exercicio37;

public class NumerosAleatorios {

    public static void main(String[] args) {
        int contador = 0;

        while(true) {
            int numeroAleatorio = (int) (Math.random() * 10) + 1; // Gera um número aleatório entre 1 e 10
            System.out.println("Número gerado: " + numeroAleatorio);
            contador++;

            if (numeroAleatorio == 7) {
                contador-= 1; // Não conta o 7 no total;
                break; // Sai do loop se o número gerado for 7
            }
        }
        System.out.println("Total de números gerados antes de obter o 7: " + contador);
    }
}
