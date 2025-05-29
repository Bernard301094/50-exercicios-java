/*
Exercício 24: Crie um programa que conte quantas vogais (a, e, i, o, u, maiúsculas e minúsculas)
existem em uma frase inserida pelo usuário, usando um loop for.
*/

package main.java.loops_for.exercicio24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContarVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou uma frase: ");
        // Cria uma lista imutável contendo as vogais minúsculas.
        // Esta lista será usada para verificar se um caractere é uma vogal.
        List<Character> vogais = Arrays.asList('a', 'e', 'i', 'o', 'u');

        String texto = scanner.nextLine(); // Lê a linha inteira de texto digitada pelo usuário.
        int quantidadeVogais = 0; // Variável para armazenar a contagem de vogais, inicializada em 0.

        // Início do loop 'for'. Este loop irá iterar sobre cada caractere da String 'texto'.
        // 1. 'int i = 0;': Inicialização.
        //    - Declara uma variável de controle 'i' (índice) e a inicializa com 0.
        //    - Isso significa que começaremos a analisar o texto a partir do primeiro caractere (índice 0).
        // 2. 'i <= texto.length() - 1;': Condição de continuação.
        //    - 'texto.length()' retorna o número total de caracteres na string 'texto'.
        //    - 'texto.length() - 1' é o índice do último caractere da string (pois os índices começam em 0).
        //    - O loop continuará enquanto 'i' (o índice atual) for menor ou igual ao índice do último caractere.
        //    - Uma forma alternativa e mais comum de escrever essa condição seria 'i < texto.length()'.
        // 3. 'i++': Incremento.
        //    - Após cada iteração do loop (execução do bloco de código interno), o valor de 'i' é incrementado em 1.
        //    - Isso faz com que, na próxima iteração, o próximo caractere da string seja analisado.
        for (int i = 0; i <= texto.length() - 1 ; i++) {

            // Início da estrutura condicional 'if'.
            // Esta condição verifica se o caractere ATUAL da string 'texto' é uma vogal.
            // A verificação é feita em três etapas dentro da condição do 'if':

            // 1. 'texto.charAt(i)':
            //    - O método 'charAt(i)' da string 'texto' retorna o caractere na posição (índice) 'i'.
            //    - A cada iteração do loop 'for', 'i' muda, então 'texto.charAt(i)' pega um caractere diferente da string.

            // 2. 'Character.toLowerCase( texto.charAt(i) )':
            //    - 'Character.toLowerCase()' é um método estático da classe 'Character'.
            //    - Ele converte o caractere obtido no passo anterior para sua forma minúscula.
            //    - Isso é crucial para que a contagem de vogais não diferencie maiúsculas de minúsculas
            //      (ex: 'A' será tratado da mesma forma que 'a'), já que nossa lista 'vogais' só tem minúsculas.

            // 3. 'vogais.contains( Character.toLowerCase(texto.charAt(i)) )':
            //    - 'vogais' é a lista de vogais minúsculas ('a', 'e', 'i', 'o', 'u') definida anteriormente.
            //    - O método '.contains()' verifica se a lista 'vogais' contém o caractere
            //      (que foi obtido da string 'texto' e convertido para minúsculo).
            //    - Se o caractere (em minúsculo) estiver presente na lista 'vogais', a expressão inteira retorna 'true' (verdadeiro).
            //    - Caso contrário (se não for uma vogal), retorna 'false' (falso).

            if (vogais.contains(Character.toLowerCase(texto.charAt(i)))) {
                // Se a condição do 'if' for verdadeira (ou seja, o caractere atual é uma vogal):
                // 'quantidadeVogais++' incrementa o valor da variável 'quantidadeVogais' em 1.
                quantidadeVogais++;
            }
            // Se a condição do 'if' for falsa (o caractere não é uma vogal),
            // o bloco de código acima (quantidadeVogais++) é ignorado, e o loop 'for'
            // prossegue para a próxima iteração (ou termina, se todos os caracteres já foram verificados).
        }

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos do sistema.
        System.out.println("Quantidade de vogais: " + quantidadeVogais); // Imprime o total de vogais encontradas.
    }
}