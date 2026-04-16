/*
titulo Jogo da Adivinhacao
onde o computador vai "pensar" em um número entre 0 e 10. Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final quantos palpites foram necessários para vencer.
 */
package ExerciciosConceitosBasicos.lista003;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Random gerador = new Random();

        int numeroGerado;
        int contador = 1;

        System.out.println("Sou seu computador...");
        System.out.println("Acabei de pesnar em um numero entre 0 e 10.");
        System.out.println("Sera que voce consegue adivinha qual foi? ");

        System.out.print("Qual é o seu palpite? ");
        int jogador = sc.nextInt();

        numeroGerado = gerador.nextInt(11);
       do {


            if(jogador > numeroGerado){
                System.out.println("Menos... Tente mais uma vez");
                System.out.print("Qual é o seu palpite? ");
                jogador = sc.nextInt();
            } else if (jogador < numeroGerado) {
                System.out.println("Mais... Tente mais uma vez");
                System.out.print("Qual é o seu palpite? ");
                jogador = sc.nextInt();
            }
            contador++;


            }while (jogador != numeroGerado);

        System.out.printf("Acertou com %d tentativa. Parabens\n", contador);


        sc.close();




        }
}
