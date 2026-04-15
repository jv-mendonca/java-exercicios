/*
Titulo Conversor De Moedas
leia um valor em reais e converta para dolares (Valor do Dolar 5,23 -> dia 26/03/2026)
 */
package ExerciciosConceitosBasicos.lista002;

import java.util.Locale;
import java.util.Scanner;

public class ConversoDeMoedas {
    public static final double  VALOR_DOLAR = 5.23;
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em Reais: R$ ");
        double valorReais = sc.nextDouble();

        double dolar = valorReais / VALOR_DOLAR;

        System.out.printf("Com R$%.2f voce pode  comprar US%.2f Dolares", valorReais, dolar);
        sc.close();

        sc.close();
    }
}
