/*
Titulo Reajuste Salarial
leia o salario de um funcionario e aplaique um aumento de 15%
 */
package ExerciciosConceitosBasicos.lista002;

import java.util.Locale;
import java.util.Scanner;

public class ReajusteSalarial {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o seu salario: ");
        double salario = sc.nextDouble();

        double novoSalario = salario + (salario *0.15);

        System.out.printf("O funcionario tinha um salario de R$%.2f\n",salario);
        System.out.printf("Agora com um aumento de 15%% o salario do funcionaro é de R$%.2f\n", novoSalario);

        sc.close();

    }
}
