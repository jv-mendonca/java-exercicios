/*
titulo: Dobro, triplo e Raiz
leia um numero e mostro:
 - dobro
 - triplo
 - Raiz quadrada
 */
package ExerciciosConceitosBasicos.lista001;

import java.util.Locale;
import java.util.Scanner;

public class DobroTriploERaiz {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroUsuario = sc.nextInt();


        int dobro = numeroUsuario * 2;
        int triplo = numeroUsuario * 3;
        double raizQuadrada = Math.sqrt(numeroUsuario);


        System.out.printf("O dobro do numero %d é %d\n", numeroUsuario, dobro);
        System.out.printf("O triplo do numero %d é %d\n", numeroUsuario, triplo);
        System.out.printf("A Raiz quadrada  do numero %d é %.2f\n", numeroUsuario, raizQuadrada);

        sc.close();

    }
}
