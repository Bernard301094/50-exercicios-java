/*
    Exercício 41: Crie uma classe Carro com atributos como marca, modelo e ano.
    Inclua um método para mostrar as informações do carro.
    Crie dois objetos do tipo Carro e exiba suas informações.
*/

package main.java.poo.exercicio41;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2021;

        System.out.println("Informações do Carro 1:");
        carro1.mostrarInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.mostrarInformacoes();
    }
}
