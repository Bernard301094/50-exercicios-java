/*
Desenvolva um programa que calcule a soma dos números de 1 a 100 usando um loop for.
*/

package main.java.loops_for.exercicio13;

public class Soma1a100 {

    public static void main(String[] args) {

        int somaTotal = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print(somaTotal + " + " + i);
            somaTotal += i;
            System.out.println(" = " + somaTotal);
        }
    }
}
