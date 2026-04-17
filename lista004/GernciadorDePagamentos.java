/*
Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e condição de pagamento:
à vista dinheiro/cheque: 10% de desconto
à vista no cartão: 5% de desconto
em até 2x no cartão: preço formal
3x ou mais no cartão: 20% de juros

 */
package ExerciciosConceitosBasicos.lista004;

import java.util.Locale;
import java.util.Scanner;

public class GernciadorDePagamentos {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço das compras: R$");
        double valorCompra = sc.nextDouble();

        System.out.println("Formas de Pagamento");
        System.out.println("[ 1 ] à Vista dinheiro/cheque");
        System.out.println("[ 2 ] à Vista Cartao");
        System.out.println("[ 3 ] 2x no cartao");
        System.out.println("[ 4 ] 3x ou mais no cartao");
        System.out.println("Qual é a sua opcao: ");
        int opcao = sc.nextInt();


        double valorFinal = calcularPagamento(opcao, valorCompra, sc);

        System.out.printf("Sua compra de R$%.2f vai custar R$%.2f no final", valorCompra,valorFinal);

        sc.close();

    }
    public static double calcularPagamento(int opcao, double valorCompra, Scanner sc){
        switch (opcao){
            case 1:
                return  valorCompra - (valorCompra * 0.10);


            case 2:
                return  valorCompra - (valorCompra * 0.05);


            case 3:
                return  valorCompra / 2;


            case 4:
                System.out.print("Em quantas vezes: ");
                int quantidadeParcelas = sc.nextInt();

                if (quantidadeParcelas < 3) {
                    System.out.println("Para essa opção, mínimo de 3 parcelas.");
                    return valorCompra;
                }

                double totalComJuros = valorCompra * 1.20;
                double valorParcela = totalComJuros / quantidadeParcelas;

                System.out.printf("Sua compra será parcelada em %dx de R$%.2f\n",
                        quantidadeParcelas, valorParcela);

                return totalComJuros;


            default:
                System.out.println("Opcao invalida");
                return valorCompra;
        }

    }
}
