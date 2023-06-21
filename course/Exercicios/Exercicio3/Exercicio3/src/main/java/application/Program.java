package application;

import entities.Heigth;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, menor;
        double media, perc, soma;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        Heigth[] vect = new Heigth[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            sc.nextLine();
            System.out.printf("\nNome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double heigth = sc.nextDouble();
            vect[i] = new Heigth(name, age, heigth);
        }


        menor = 0;
        soma = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menor++;
            }
            soma += vect[i].getHeight();
        }

        media = soma / vect.length;
        perc = ((double) menor * 100) / vect.length;
        System.out.printf("Altura média: %.2f", media);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n ", perc);


        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }
}
