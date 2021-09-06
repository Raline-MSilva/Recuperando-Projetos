package br.com.zup;

import java.util.Scanner;

public class Ex3_Lista4 {
    public static void main(String[] args) {
        //3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de número desejado: ");
        double qntNumerosUsuario = leitor.nextDouble();

        //criando as variaveis
        double numeroDesejados;
        double soma = 0;
        int contador = 1;

        //iniciando o while
        while (contador <= qntNumerosUsuario){
            System.out.println("Digite o número " + contador);
            numeroDesejados = leitor.nextDouble();

            soma = soma + numeroDesejados;
            contador ++;
        }
        System.out.println("Soma dos números escolhidos é de: " + soma);
    }
}
