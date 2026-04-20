/*
titulo contagem dos pares
Crie um programa que mostre na tela todos os números pares que estão no intervalo entre 1 e 50.

 */
package ExerciciosConceitosBasicos.lista005;

import java.util.Locale;
import java.util.Scanner;

public class ContagemDosPares {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for(int i = 2; i <= 50; i = i + 2){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
        System.out.println("Acabou");
        sc.close();
    }
}
