package br.com.zup;

import java.util.Scanner;

public class Ex1_lista5 {

    /*1 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e
     mostrar a quantidade de números pares desses números.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite a quantidade de números que deseja: ");
        double numerosEscolhido = leitor.nextDouble();
        int pares = 0;
        int contador = 0;

        while (contador < numerosEscolhido){
            System.out.println("Digite um número: " + (contador + 1));
            double numeros = leitor.nextDouble();

            if (numeros % 2 == 0){
                pares += 1;
            }
            contador ++;
        }
        System.out.println("Os números pares dos seus números escolhidos são: " + pares);
    }
}
