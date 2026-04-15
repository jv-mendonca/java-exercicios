/*
Titulo Converso de Temperatura
Converta uma temperatura de celsius para Fahrenheit.
 */
package ExerciciosConceitosBasicos.lista002;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f Celsius -> %.2f Fahrenheit", celsius, fahrenheit);

        sc.close();

    }
}
