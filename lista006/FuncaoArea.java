/*
Você deve desenvolver um programa em Java que calcule a área de um terreno retangular.

O programa deve:

Solicitar ao usuário a largura do terreno (em metros);
Solicitar ao usuário o comprimento do terreno (em metros);
Criar uma função que receba esses dois valores e retorne a área do terreno;
Exibir o resultado final de forma formatada, mostrando as dimensões informadas e a área calculada.
 */
package ExerciciosConceitosBasicos.lista006;

import java.util.Locale;
import java.util.Scanner;

public class FuncaoArea {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Controle de Terrenos: ");
        System.out.println("-----------------------");

        System.out.print("Largura (m): ");
        double largura = sc.nextDouble();

        System.out.print("Comprimento (m):  ");
        double comprimento = sc.nextDouble();

        double area = area(largura, comprimento);

        System.out.printf("A área de um terreno e de %.2fX%.2f é de %.2f m² \n",largura, comprimento, area);
        sc.close();



    }
    public static double area(double largura, double comprimento){
        return  largura * comprimento;
    }
}
