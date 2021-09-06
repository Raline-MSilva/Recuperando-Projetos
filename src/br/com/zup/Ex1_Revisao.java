package br.com.zup;

import java.util.Scanner;

public class Ex1_Revisao {
    //1 - Faça um programa que pergunte o preço de três produtos e
    // informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // pedindo ao usuário os valores dos produtos
        System.out.println("Por favor digite o valor do Produto 1: ");
        double produto1 = leitor.nextDouble();
        System.out.println("Por favor digite o valor do Produto 2: ");
        double produto2 = leitor.nextDouble();
        System.out.println("Por favor digite o valor do Produto 3: ");
        double produto3 = leitor.nextDouble();

        //criando a estrutura de condição
        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("O produto 1 é mais barato");
        }
        else if (produto2 < produto1 & produto2 < produto3) {
            System.out.println("O produto 2 é mais barato");
        }
        else if (produto3 < produto1 & produto3 < produto2) {
            System.out.println("Produto 3 é mais barato");
        }
        else {
            System.out.println("Por favor digite valores diferentes");
        }

    }
}
