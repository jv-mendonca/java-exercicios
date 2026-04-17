/*
Titulo Comparando Numero
leia dois numeros e informe qual é maior
 */
package ExerciciosConceitosBasicos.lista004;

import java.util.Locale;
import java.util.Scanner;

public class ComparandoNumeros {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira numero: ");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Segundo Numero: ");
        double segundoNumero = sc.nextDouble();


        if(primeiroNumero > segundoNumero){
            System.out.printf("O numero %.1f é Maior que %.1f\n", primeiroNumero, segundoNumero);
        }else {
            System.out.printf("O numero %.1f é Maior que %.1f\n",segundoNumero,  primeiroNumero);
        }


    }
}
