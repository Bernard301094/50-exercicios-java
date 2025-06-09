/*
    Exercício 42: Defina uma classe Retângulo com os atributos base e altura.
    Adicione métodos para calcular a área (base * altura) e o perímetro (2 * (base + altura)).
    Crie um objeto Retângulo e exiba sua área e perímetro.
*/

package main.java.poo.exercicio42;

public class Retangulo {
    int base;
    int altura;

    public void calcularArea() {
        int area = base * altura;
        System.out.println("Área do retângulo: " + area);
    }

    public void calcularPerimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.base = 5;
        retangulo.altura = 10;
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        Retangulo retangulo2 = new Retangulo();
        retangulo2.base = 7;
        retangulo2.altura = 3;
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();

    }
}
