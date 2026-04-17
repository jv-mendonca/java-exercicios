/*
TItulo Media Aluno
 Crie um programa que leia duas notas de um aluno e calcule sua média, mostrando uma mensagem no final, de acordo com a média atingida:
Média abaixo de 5.0: REPROVADO
Média entre 5.0 e 6.9: RECUPERAÇÃO
Média 7.0 ou superior: APROVADO

 */
package ExerciciosConceitosBasicos.lista004;

import java.util.Locale;
import java.util.Scanner;

public class MediaDoAluno {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Primeira Nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Segunda Nota:");
        double segundaNota = sc.nextDouble();

        double mediaFinal = (primeiraNota +  segundaNota) / 2;

        System.out.printf("Tirando %.2f e %.2f, a media do aluno é %.2f%n",
                primeiraNota, segundaNota, mediaFinal);

        if (mediaFinal < 5.0) {
            System.out.println("O aluno está REPROVADO");
        } else if (mediaFinal < 7.0) {
            System.out.println("O aluno está em RECUPERAÇÃO");
        } else {
            System.out.println("O aluno está APROVADO");
        }
    }
}
