/*
Titulo Primeiro e Ultima ocorrencia de uma String
 */
package ExerciciosConceitosBasicos.lista006;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraEUltimaOcorrenciaDeUmaString {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma Frase: ");
        String frase = sc.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.printf("A letra A aparece %d vezes\n", contador);


        int primeira = frase.indexOf('A');


        int ultima = frase.lastIndexOf('A');

        System.out.println("Primeira posição: " + primeira);
        System.out.println("Última posição: " + ultima);
    }
}
