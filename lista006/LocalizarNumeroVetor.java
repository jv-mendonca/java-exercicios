/*
Buscar Número no Vetor

Faça um programa que:

Leia 10 números inteiros e armazene em um vetor;
Peça um número para buscar;
Verifique em quais posições esse número aparece;
Mostre também quantas vezes ele foi encontrado.
 */
package ExerciciosConceitosBasicos.lista006;

import java.util.Locale;
import java.util.Scanner;

public class LocalizarNumeroVetor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[11];
        int contador = 0;
        System.out.print("Digite 10 numeros: \n" );
        for(int i = 1; i < numeros.length; i++){
            System.out.print("Posicao " + i + "-> " );
            numeros[i] = sc.nextInt();

        }
        System.out.print("\nDigite um numero para buscar: ");
        int numeroBusca = sc.nextInt();

        System.out.println("Numero encontrado na posicao");
        for( int i = 1 ; i < numeros.length; i++){
            if(numeros[i] == numeroBusca){
                System.out.println("Posicao -> " + i );
                contador++;
            }
        }
        System.out.println("---------------------------------------------------------");

        System.out.print("\nResultado");

        if(contador == 0){
            System.out.println("Nenhum numero encontrado");
        }else{
            System.out.println("\nQuantidade de veze que apereceu " + contador);


        }
        System.out.println("---------------------------------------------------------");



        sc.close();

    }
}
