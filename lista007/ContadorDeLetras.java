/*
titulo contador de Letras
Crie um programa que leia uma frase e uma letra, e informe quantas vezes essa letra aparece na frase, sem diferenciar maiúsculas de minúsculas.
 */
package ExerciciosConceitosBasicos.lista007;
import java.util.Locale;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma Frase: ");
        String frase = sc.nextLine().toUpperCase();

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);

        int totalLetras = 0;
        char temp;

        for(int i = 0; i < frase.length(); i++ ){
            temp = frase.charAt(i);
            if(temp == letra){
                totalLetras++;

            }
        }
        System.out.printf("A Letra %s aparece %d vezes na frase", letra, totalLetras);


        sc.close();
    }
}
