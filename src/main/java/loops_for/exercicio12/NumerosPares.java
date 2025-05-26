/*
Exercício 12: Crie um programa que imprima números pares de 2 a 20.
*/

package main.java.loops_for.exercicio12;

public class NumerosPares {

    public static void main(String[] args) {
        int numeroPar = 2;
        int limite = 20;

        for (int i = numeroPar; i <= limite; i += 2) {
            System.out.print(i);
        }
    }
}
