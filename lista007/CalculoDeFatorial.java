/*
Cálculo de Fatorial

Faça um programa que:

Leia um número inteiro;
Calcule o seu fatorial;
Mostre o resultado na tela.

📌 O fatorial de um número é a multiplicação dele por todos os números anteriores até 1.
 */
package ExerciciosConceitosBasicos.lista007;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeFatorial {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para calcular seu Fatorial: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= numero ; i++){
                fatorial *=i;
        }
        System.out.println("Fatorial de " + numero + " = " + fatorial);

        sc.close();
    }
}
