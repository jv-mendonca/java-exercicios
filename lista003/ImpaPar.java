/*
Titulo Impar ou Par
Leia um numero e informe se ele é par ou impar

 */
package ExerciciosConceitosBasicos.lista003;

import java.util.Locale;
import java.util.Scanner;

public class ImpaPar {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();


        if(numero % 2 == 0){
            System.out.printf("O numero é %d Par", numero);

        }else{
            System.out.printf("O numero é %d Impar", numero);
        }
    }
}
