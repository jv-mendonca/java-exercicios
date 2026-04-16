/*
Titulo Area da Parede
Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

 */
package ExerciciosConceitosBasicos.lista003;

import java.util.Locale;
import java.util.Scanner;

public class AreaDaParede {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Largura: ");
        double larguraParede = sc.nextDouble();

        System.out.println("Altura: ");
        double alturaParede  = sc.nextDouble();

        double area = alturaParede * larguraParede;


        System.out.printf("A Area da Parede é de %.2f\n", area);

        sc.close();
    }
}
