/*
Titulo: Conversor de Medida
Leia um valor em metros e convertar para
 - mm
 - cm
 - dm
 - m
 - dam
 - hem
 - km

 */
package ExerciciosConceitosBasicos.lista001;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMedida {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em Metros: ");
        double valorMetros = sc.nextDouble();

        double mm = valorMetros * 1000;   // milímetros
        double cm = valorMetros * 100;    // centímetros
        double dm = valorMetros * 10;     // decímetros
        double dam = valorMetros / 10;    // decâmetros
        double hm = valorMetros / 100;    // hectômetro
        double km = valorMetros / 1000;   // quilômetros

        System.out.printf("Valor em Metros: %.2f \n",valorMetros);

        System.out.println("Valores convertidos");
        System.out.printf("Metros -> milimetros: %.2f \n",mm);
        System.out.printf("Metros -> centrimetros: %.2f \n",cm);
        System.out.printf("Metros -> decímetros: %.2f \n",dm);
        System.out.printf("Metros -> decâmetros: %.2f \n",dam);
        System.out.printf("Metros -> hectômetro: %.2f \n",hm);
        System.out.printf("Metros -> quilômetros: %.2f \n",km);


        sc.close();


    }
}
