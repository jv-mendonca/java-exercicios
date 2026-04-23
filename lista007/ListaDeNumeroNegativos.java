/*

50 - Lista de numeros "negativos" - 15/02/2026

 */
package ExerciciosConceitosBasicos.lista007;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ListaDeNumeroNegativos {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        ArrayList<Integer> listaDeNumerosNegativos = new ArrayList<>();


        for(int i =1; i <= 10; i++){
            System.out.printf("Digite o %d numero: ", i);
            int numero = sc.nextInt();;

            listaDeNumeros.add(numero);
        }


        for(int numero : listaDeNumeros){
            if(numero < 0){
                listaDeNumerosNegativos.add(numero);
            }
        }
        System.out.println("Lista de Numero Negativos:");
        for(int numero : listaDeNumerosNegativos){
            System.out.println(numero);
        }


    }
}
