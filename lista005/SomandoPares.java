/*
Titulo Soma dos Pares
 Desenvolva um programa que leia seis números inteiros e mostre a soma apenas daqueles que forem pares.
 Se o valor digitado for ímpar, desconsidere-o.
 */
package ExerciciosConceitosBasicos.lista005;

import java.util.Locale;
import java.util.Scanner;

public class SomandoPares {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int totalPares = 0;
        int resultado = 0;


        for(int i = 1; i <= 6; i++){
            System.out.printf("digite %d numero: ", i);
             int numero = sc.nextInt();

            if(numero % 2 == 0){
                totalPares++;
            }

            resultado += verificadorDeImparPar(numero);
        }

        System.out.printf("Voce digitou %d numeros pares e a soma foi %d ", totalPares, resultado);
    }
    public static int verificadorDeImparPar(int numero){
        int somaPares = 0;

        if(numero  % 2 == 0){
             somaPares += numero;
        }
        return somaPares;
    }

}
