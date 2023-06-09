package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaoir;

        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];




        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();



        }
        maioridade = idade[0];
        posicaomaoir = 0;
        int age = 0;
        for (int i = 1; i < n; i++){
            if (idade[i] > maioridade){
                maioridade = idade[i];
                posicaomaoir = i;

            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", (nome[posicaomaoir]));




        sc.close();


    }
}
