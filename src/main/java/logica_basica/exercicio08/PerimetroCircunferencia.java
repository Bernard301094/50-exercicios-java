/*
Exercício 8: Crie um programa que calcule o perímetro de um círculo solicitando ao usuário o raio (Perímetro = 2 * PI
 * raio). Use Math.PI para o valor de PI.
*/

package main.java.logica_basica.exercicio08;

import java.util.Scanner;

public class PerimetroCircunferencia {

    public void calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o diâmetro da circunsferência?");
        double diametro = scanner.nextInt();
        double raio = diametro / 2;

        double perimetro = 2 * (Math.PI) * raio;
        System.out.printf("O perímetro da circunsferência é: %.2f" , perimetro);

        scanner.close();
    }

    public static void main(String[] args) {
        PerimetroCircunferencia perimetro = new PerimetroCircunferencia();
        perimetro.calcularPerimetro();
    }
}
