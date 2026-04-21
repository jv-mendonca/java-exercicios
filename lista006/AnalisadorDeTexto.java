/*
Titulo analisador de texto

Crie um programa que leia o nome completo de uma pessoa e mostre:
O nome com todas as letras maiúsculas e minúsculas.
Quantas letras ao todo (sem considerar espaços).
Quantas letras tem o primeiro nome.
 */

package ExerciciosConceitosBasicos.lista006;


import java.util.Locale;
import java.util.Scanner;

public class AnalisadorDeTexto {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine().trim();

        System.out.println("Maiusculas: " + nome.toUpperCase());
        System.out.println("Maiusculas: " + nome.toLowerCase());

        int totalLetras = nome.replace(" ", "").length();
        System.out.println("Total Letras: " + totalLetras);

        String primeiroNome = nome.split(" " )[0];
        System.out.println("Primeiro Nome " + primeiroNome);
        System.out.println("Letras do primeiro nome: " + nome.length());

        sc.close();




    }
}
