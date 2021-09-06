package br.com.zup;

import java.util.Scanner;

public class Desafio_Lista5 {
    /*Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
    O menor valor
    O maior valor
    A soma dos valores.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de números que deseja: ");
        int qntNumeros = leitor.nextInt();

        int menorValor = 0;
        int maiorValor = 0;
        int somaValores = 0;
        int contador = 0;

        while (contador < qntNumeros) {
            System.out.println("Digite um número: " + (contador + 1));
            int numEscolhidos = leitor.nextInt();

            somaValores = somaValores + numEscolhidos;
            contador++;

            if (qntNumeros < numEscolhidos){
                menorValor = numEscolhidos;
            }
            else if(qntNumeros >= numEscolhidos){
                maiorValor = numEscolhidos;
            }
        }
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("A soma dos números escolhidos é: " + somaValores);

    }

}
