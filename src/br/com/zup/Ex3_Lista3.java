package br.com.zup;

import java.util.Scanner;

public class Ex3_Lista3 {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            // criando as variaveis

            int maiorValor = 0;
            int menorValor = 0;
            int contador = 1;

            // iniciando o comando de repetição
            while (contador <= 10) {
                System.out.println("Digite " + contador+ " número: ");
                int numeros = leitor.nextInt();
                // iniciando o comando de decisão dentro do while
                // como o meu contador já inicia com 1, e sabemos que o usuario dirá ao menos 1 número, então: contador ==1
                if (contador == 1) {
                    maiorValor = numeros;
                    menorValor = numeros;
                }
                // um if dentro else para pegarmos o maior valor dos números ditos pelo usuário
                else {
                    if (numeros >= maiorValor){
                        maiorValor = numeros;

                    }
                    else if (numeros <= menorValor){
                        menorValor = numeros;
                    }
                }
                contador ++;
            }
            System.out.println("O maior valor é: " + maiorValor);
            System.out.println("O menor valor é: " + menorValor);
        }

    }
