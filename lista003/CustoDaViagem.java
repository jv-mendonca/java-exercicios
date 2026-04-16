/*
Titulo Custo de ViagemDesenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o preço da passagem, cobrando R$0,50 por Km para viagens de até 200Km e R$0,45 parta viagens mais longas.
 */
package ExerciciosConceitosBasicos.lista003;

import java.util.Locale;
import java.util.Scanner;

public class CustoDaViagem {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a istancia da viagem (km");
        double distacia = sc.nextInt();

        double preco;

        if(distacia <= 200){
            preco = distacia * 0.50;

        }else {
            preco = distacia * 0.45;
        }

        System.out.printf("O custo da viagem é de: R$%.2f%n", preco);
        sc.close();
    }
}
