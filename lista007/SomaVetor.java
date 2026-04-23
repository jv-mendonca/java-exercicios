/*
Faça um programa que:

Leia 10 números e armazene em uma lista;
Calcule a soma de todos os valores;
Mostre o resultado final na tela.
 */
package ExerciciosConceitosBasicos.lista007;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        ArrayList<Double> numeros = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite o %d numeros: ", i);
            double numero = sc.nextInt();
            numeros.add(numero);
        }

        int soma = 0;

        for(double n : numeros){
            soma+=n;
        }


        System.out.println("\nSoma dos valores: " + soma);

        sc.close();
    }
}
