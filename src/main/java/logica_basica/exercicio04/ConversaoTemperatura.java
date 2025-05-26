/*
Exercício 4: Escreva um programa que converta graus Celsius em Fahrenheit. A fórmula é F = (C * 9/5) + 32. Peça ao usuário a temperatura em Celsius.
*/

package main.java.logica_basica.exercicio04;

import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quántos ºC quer converter para ºF?");

        double celcius = scanner.nextDouble();
        double fahrenheint = (celcius * 9 / 5) + 32;

        System.out.printf("%.2f" + "ºC é igual a: %.2f" + "ºF", celcius, fahrenheint);

        scanner.close();

    }
}
