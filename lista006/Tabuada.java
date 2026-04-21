/*
titulo - Tabuada
Faça um programa que mostre a tabuada de
vários números, um de cada vez, para cada valor digitado pelo usuário.
O programa será interrompido quando o número solicitado for negativo.

*/
package ExerciciosConceitosBasicos.lista006;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String opcao;


        do {
            System.out.println("Quer ver a tabuada de qual valor? ");
            double numeroUsuario = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------------");
            for(int i = 1; i <= 10; i++){
                    System.out.printf("%.1f X %d = %.1f\n", numeroUsuario, i, numeroUsuario * i);
                }
            System.out.println("Quer ver outra tabuada [Sim]/[Nao]");
            opcao = sc.nextLine().toUpperCase();

        }while(opcao.equalsIgnoreCase("SIM"));

            sc.close();
        }
}


