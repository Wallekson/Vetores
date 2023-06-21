package application;

import entities.Users;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double menorAltura;

        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();

        Users[] users = new Users[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);
            users[i] = new Users (altura,genero);
        }


        for (int i = 0; i < n; i++){
            if (users[i].getAltura() <  users[0]){

            }
        }






    }
}
