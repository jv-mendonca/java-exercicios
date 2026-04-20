/*
Grupo de Maioridade

 Crie um programa que leia o ano de nascimento de sete pessoas. No final, mostre quantas pessoas ainda
 não atingiram a maioridade e quantas já são maiores.
 */
package ExerciciosConceitosBasicos.lista005;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GrupoDeMaioridade {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maiores = 0 ;
        int menores = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        ArrayList<String> listaPessoas = new ArrayList<>();
        ArrayList<LocalDate> datas = new ArrayList<>();



        for(int i = 1 ; i <= 2; i++){
            System.out.printf("Nome da %d pessoa: ", i);
            String nome = sc.nextLine();

            LocalDate dataNascimento = null;

            while (dataNascimento == null) {
                System.out.print("data (dd/MM/yyyy): ");
                String dataTexto = sc.nextLine();

                dataTexto = dataTexto.replace("-", "/");
                dataTexto = dataTexto.replace(" ", "/");

                try {
                    LocalDate dataTemp = LocalDate.parse(dataTexto, formatter);

                    if(dataTemp.isAfter(LocalDate.now())){
                        System.out.println("A data nao pode ser no futuro");
                    }else {
                        dataNascimento = dataTemp;
                    }

                } catch (Exception e) {
                    System.out.println("Data inválida! Tente novamente.\n");
                }
            }

            listaPessoas.add(nome);
            datas.add(dataNascimento);
        }


        for (int i = 0; i < listaPessoas.size(); i++) {
            int idade = Period.between(datas.get(i), LocalDate.now()).getYears();

            if (idade >= 18) {
                maiores++;
            } else {
                menores++;
            }
        }

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Mostrar maiores de idade");
            System.out.println("2 - Mostrar menores de idade");
            System.out.println("3 - Mostrar ambos");
            System.out.println("4 - Mostrar totais");
            System.out.println("5 - Cadastrar novas pessoas");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n=== MAIORES ===");
                    for (int i = 0; i < listaPessoas.size(); i++) {
                        int idade = Period.between(datas.get(i), LocalDate.now()).getYears();

                        if (idade >= 18) {
                            System.out.println(listaPessoas.get(i) + " | " + idade);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== MENORES ===");
                    for (int i = 0; i < listaPessoas.size(); i++) {
                        int idade = Period.between(datas.get(i), LocalDate.now()).getYears();

                        if (idade < 18) {
                            System.out.println(listaPessoas.get(i) + " | " + idade);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== TODOS ===");
                    for (int i = 0; i < listaPessoas.size(); i++) {
                        int idade = Period.between(datas.get(i), LocalDate.now()).getYears();

                        if (idade >= 18) {
                            System.out.println("[MAIOR] " + listaPessoas.get(i) + " | " + idade);
                        } else {
                            System.out.println("[MENOR] " + listaPessoas.get(i) + " | " + idade);
                        }
                    }
                    break;

                case 4:

                    maiores = 0;
                    menores = 0;

                    for (int i = 0; i < listaPessoas.size(); i++) {
                        int idade = Period.between(datas.get(i), LocalDate.now()).getYears();

                        if (idade >= 18) {
                            maiores++;
                        } else {
                            menores++;
                        }
                    }

                    System.out.printf("\nAo todo tivemos %d pessoas maiores de idade\n", maiores);
                    System.out.printf("E também %d pessoas menores de idade\n", menores);
                    break;


                case 5:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    LocalDate dataNascimento = null;

                    while (dataNascimento == null) {
                        System.out.print("Data (dd/MM/yyyy): ");
                        String dataTexto = sc.nextLine();

                        try {
                            LocalDate dataTemp = LocalDate.parse(dataTexto, formatter);

                            if (dataTemp.isAfter(LocalDate.now())) {
                                System.out.println("Data no futuro!");
                            } else {
                                dataNascimento = dataTemp;
                            }

                        } catch (Exception e) {
                            System.out.println("Data inválida!");
                        }
                    }

                    listaPessoas.add(nome);
                    datas.add(dataNascimento);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        sc.close();
    }

}
