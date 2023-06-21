package application;

import entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Alunos[] vect = new Alunos[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
            System.out.println();
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Alunos(nome, nota1, nota2);
        }

        System.out.println("ALUNOS APROVADOS: ");

        double media = 0;
        for (int i = 0; i < n; i++) {
            media = (vect[i].getNota1() + vect[i].getNota2()) / 2;
            if (media >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }
    }
}
