/*
Titulo: Media Aritmetica
leia duas notas e calcule a media do aluno
 */

package ExerciciosConceitosBasicos.lista001;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String nomeAluno = sc.next();

        System.out.print("Primeira Nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.print("Segunda Nota: ");
        double segundaNota = sc.nextDouble();


        double mediaAluno = (primeiraNota + segundaNota) / 2;

        System.out.printf("A media do %s é %.2f", nomeAluno, mediaAluno);
        sc.close();


    }
}
