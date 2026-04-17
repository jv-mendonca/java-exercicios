/*
Titulo Indice Massa Corporal
Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu Índice de Massa Corporal (IMC) e mostre seu status, de acordo com a tabela abaixo:
IMC abaixo de 18,5: Abaixo do Peso
Entre 18,5 e 25: Peso Ideal
25 até 30: Sobrepeso
30 até 40: Obesidade
Acima de 40: Obesidade Mórbida
 */

package ExerciciosConceitosBasicos.lista004;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class IndiceDeMassaCorporal {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String opcao;

        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<Double> listaImc = new ArrayList<>();


        do {
            System.out.println("Indice de Massa Corporal:");

            System.out.print("Informe o seu Nome: ");
            String nome  = sc.nextLine();

            System.out.print("Qual é o seu peso? (kg): ");
            double peso = sc.nextDouble();

            System.out.print("Qual é o sua altura? (m): ");
            double altura = sc.nextDouble();

            sc.nextLine();

            listaNomes.add(nome);
            listaImc.add(calcularImc(peso,altura));

            System.out.print("Deseja adicionar outro atleta? (s/n): ");
            opcao = sc.nextLine().toLowerCase();
            System.out.println();


        } while (!opcao.equalsIgnoreCase("n") && !opcao.equalsIgnoreCase("nao"));


        System.out.println("\nResultados:");
        for(int i = 0; i < listaNomes.size();i++ ){
            double imc = listaImc.get(i);
            System.out.println("Nome: " + listaNomes.get(i) +
                    " | IMC: " + String.format("%.2f", imc) +
                    " | Classificacao: " + classificarImc(imc));
        }

        sc.close();
    }


    public static double calcularImc(double peso, double altura){
        return  peso / (altura * altura);
    }

    public static String classificarImc(double imc){
        if (imc < 18.5) return "Magreza";
        else if (imc < 25) return "Normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade I";
        else if (imc < 40) return "Obesidade II";
        else return "Obesidade III";
    }

}
