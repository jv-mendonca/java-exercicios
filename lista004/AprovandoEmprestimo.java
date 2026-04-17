/*
Faça um programa que:

Leia o valor de uma casa, o salário do comprador e em quantos anos ele vai pagar;
Calcule o valor da parcela mensal;
Verifique se a parcela é menor ou igual a 30% do salário;
Mostre se o empréstimo será aprovado ou não.
 */
package ExerciciosConceitosBasicos.lista004;

import java.util.Locale;
import java.util.Scanner;

public class AprovandoEmprestimo {
    public static  boolean aprovarEmprestimo( double valorCasa, double salario, int anos ){
        double parcela = valorCasa /(anos * 12);
        double limite = salario * 0.30;

        return  parcela <= limite;
    }
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da casa: ");
        double valorCasa = sc.nextDouble();

        System.out.println("Salario: ");
        double salario = sc.nextDouble();

        System.out.println("Anos para pagar: ");
        int anos = sc.nextInt();


        double parcela = valorCasa / (anos * 12);


        int totalMeses = anos * 12;



        System.out.println("\nTotal de meses: " + totalMeses);
        System.out.printf("Valor da parcela: R$ %.2f%n", parcela);

        if (aprovarEmprestimo(valorCasa, salario, anos)) {
            System.out.println("Empréstimo APROVADO!");
        } else {
            System.out.println("Empréstimo NEGADO!");
        }


        sc.close();

    }
}
