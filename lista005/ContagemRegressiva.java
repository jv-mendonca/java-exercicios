/*
Titulo Contagem regressiva
 Faça um programa que mostre na tela uma
 contagem regressiva para o estouro de fogos de artifício,
 indo de 10 até 0, com uma pausa de 1 segundo entre eles.
 */
package ExerciciosConceitosBasicos.lista005;

import java.util.Locale;
import java.util.Scanner;

public class ContagemRegressiva {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for(int i = 10; i > 0; i--){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        sc.close();
    }
}
