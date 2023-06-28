package application;

import entities.Rents;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, position;

        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();


        Rents[] rents = new Rents[10];

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int numberRoom= sc.nextInt();

            rents[numberRoom] = new Rents(name, email);



        }
        System.out.println("Busy rooms: ");

        for (int i = 0; i < 10; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);

                }



        }
        sc.close();
    }


}

