package br.com.zup;

import java.util.Scanner;

public class Ex4_Lista4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //4 - Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.

        double numerosDitoPeloUsuario;
        double soma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Digite a quantidade de números que deseja: ");
        numerosDitoPeloUsuario = leitor.nextDouble();

        while (contador < numerosDitoPeloUsuario){
            System.out.println("Digite um número: ");
            double numerosEscolhidos = leitor.nextDouble();

            soma = soma + numerosEscolhidos;
            contador ++;
        }
        media = soma / numerosDitoPeloUsuario;

        System.out.println("A soma dos números é de: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}