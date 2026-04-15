/*
Titulo: Antecessor e Sucessor
Lei um numero inteiro e mostre
 - seu sucessor
 - seu antecessor
 */


package ExerciciosConceitosBasicos.lista001;

import java.util.Locale;
import java.util.Scanner;

public class AntecessoESucessor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um numero: ");
        int numeroUsuario = sc.nextInt();


        int antecessor = numeroUsuario - 1;
        int sucessor = numeroUsuario + 1;

        System.out.printf("O Sucessor de %d é %d\n",numeroUsuario, sucessor);
        System.out.printf("O Antecessor de %d é %d\n", numeroUsuario,antecessor);

        sc.close();

    }
}
