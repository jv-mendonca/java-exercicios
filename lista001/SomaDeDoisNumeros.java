/**
 * Titulo: Soma de dois numeros
 * Faca um programa que leia dois numeros inteiros e mostra a soma entre eles
 */
package ExerciciosConceitosBasicos.lista001;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeDoisNumeros {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int primeiroNumero = sc.nextInt();


        System.out.print("Digite outro numero: ");
        int segundoNumero = sc.nextInt();


        int somaTotal = primeiroNumero + segundoNumero;

        System.out.printf("A soma vale %d" , somaTotal);


        sc.close();
    }
}
