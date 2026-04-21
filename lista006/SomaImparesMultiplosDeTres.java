/*
Soma de Múltiplos de 3

Faça um programa que:

Percorra os números de 1 até 500;
Some apenas os números que são múltiplos de 3;
Mostre o resultado da soma no final.
 */
package ExerciciosConceitosBasicos.lista006;

public class SomaImparesMultiplosDeTres {
    static void main() {
        int soma = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0) {
                soma += i;
            }
        }

        System.out.println("Soma: " + soma);
    }
}
