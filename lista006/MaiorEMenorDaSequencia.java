/*
Titulo
Faca u programa que leia o peso de cinco pessoas. NO final
mostre qual foi o maior e menor peso lido;
 */
package ExerciciosConceitosBasicos.lista006;

import java.util.*;

public class MaiorEMenorDaSequencia {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> listaDePeso = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.printf("Peso da %d pessoa: ", i + 1);
            double peso = sc.nextDouble();
            listaDePeso.add(peso);
        }

        System.out.printf("Maior peso é %.2f\n", Collections.max(listaDePeso));
        System.out.printf("Menor peso é %.2f", Collections.min(listaDePeso));

        sc.close();
    }
}
