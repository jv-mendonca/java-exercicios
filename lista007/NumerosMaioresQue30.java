/*
Numeros maiores que 30
 */
package ExerciciosConceitosBasicos.lista007;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class NumerosMaioresQue30 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> listaDeNumeros  = new ArrayList<>();
        ArrayList<Integer> listaDeNumeroMaior30  = new ArrayList<>();



        for(int i =1; i <= 10; i++){
            System.out.printf("Digite o %d numero: ", i);
            int numero = sc.nextInt();;

            listaDeNumeros.add(numero);
        }


        for(int numero : listaDeNumeros){
            if(numero > 30){
                listaDeNumeroMaior30.add(numero);
            }
        }
        System.out.println("\nLista de Numero Maiores que 30:");
        for(int numero : listaDeNumeroMaior30){
            System.out.println("-> " + numero);
        }
    }
}
