package br.com.zup;

import java.util.Scanner;

public class Ex2_lista5 {
    /*2 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e
    mostrar a quantidade de números ímpares desses números.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de números que deseja: ");
        double numerosEscolhidos = leitor.nextDouble();

        int impar = 0;
        int contador = 0;

        // iniciando o while
        while (contador < numerosEscolhidos){
            System.out.println("Digite um número: " + (contador + 1));
            double numeros = leitor.nextDouble();

            // iniciando a estrutura de condição para pegar os numeros
            if (numeros % 2 != 0){
                impar += 1;
            }
            contador ++;
        }
        System.out.println("Os números ímpares dos seus números escolhidos são: " + impar);
    }
}
