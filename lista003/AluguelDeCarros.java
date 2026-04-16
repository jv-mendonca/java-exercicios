/*
Titulo ALuguel de Carro
Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.

 */
package ExerciciosConceitosBasicos.lista003;

import java.util.Locale;
import java.util.Scanner;

public class AluguelDeCarros {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias: ");
        int dias = sc.nextInt();

        System.out.println("Digite os km rodados: ");
        double km = sc.nextDouble();

        double valor = (dias * 60) + (km * 0.15);

        System.out.println("Valor total a pagar: R$ " + valor);

        sc.close();
    }
}
