package application;

import entities.Heigth;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Heigth[] vect = new Heigth[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + i + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double heigth = sc.nextDouble();
            vect[i] = new Heigth(name, age, heigth);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length;i++){
            sum += vect[i].getHeight();
        }

        double avg = sum / vect.length;
        System.out.printf("Altura média: %.2f", avg);

        double perc = 0;
        for (int i = 0; i < vect.length;i++){
            if (vect[i].getAge() < 16){
                perc = +1;
                System.out.println(vect[i].getName());

            }
        }

        double med = perc * 100 / vect.length;
        System.out.println();
        System.out.print("Pessoas com menos de 16 anos: " + med + "%");





    }
}
