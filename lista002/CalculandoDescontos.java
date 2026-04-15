/*
Titulo Calculando Descontos

Leia o preco de um produto e aplique 5% de desconto

 */
package ExerciciosConceitosBasicos.lista002;

import java.util.Locale;
import java.util.Scanner;

public class CalculandoDescontos {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();

        double produtoComDesconto = valorProduto - (valorProduto * 0.05);

        System.out.printf("O produto custava R$%.2f\n", valorProduto);
        System.out.printf("Agora com 5%% de desconto ele vai custar R$%.2f", produtoComDesconto);


        sc.close();


    }
}
