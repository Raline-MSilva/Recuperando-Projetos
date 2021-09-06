package br.com.zup;

import java.util.Scanner;

public class Ex3_lista5 {
    /*3 - Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números
    pares e a quantidade de números ímpares desses números.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de números que deseja: ");
        double numerosEscolhidos = leitor.nextDouble();

        int impar = 0;
        int par = 0;
        int contador = 0;

        while (contador < numerosEscolhidos){
            System.out.println("Por favor digite um número: "+ (contador + 1));
            double numeros = leitor.nextDouble();

            if (numeros % 2 == 0){
                par += 1;
            }

            else if (numeros % 2 != 0){
                impar += 1;
            }
            contador ++;

        }
        System.out.println("Os números pares são: " + par);
        System.out.println("Os números ímpares são: " + impar);
    }
}
