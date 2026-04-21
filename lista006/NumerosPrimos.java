/*
Números Primos

Faça um programa que:

Leia um número inteiro;
Verifique todos os números de 1 até esse valor;
Mostre quais são números primos;
Para os que não são primos, mostre entre colchetes [ ].
 */
package ExerciciosConceitosBasicos.lista006;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPrimos {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = sc.nextInt();

        for (int num = 1; num <= numero; num++) {

            boolean primo = true;

            if (num <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.print(num + " ");
            } else {
                System.out.print("[" + num + "] ");

            }
        }
    }
}