package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        String[] vectName = new String[n];
        int[] vectAge = new int[n];
        String name = null;



        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + i + "ª pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            vectName[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectAge[i] = sc.nextInt();



        }

        int age = 0;
        for (int i = 0; i < n; i++){
            if (vectAge[i] > age){
                age = vectAge[i];
                name = vectName[i];

            }
        }
        System.out.print("PESSOA MAIS VELHA: ");
        System.out.print(name);



        sc.close();


    }
}
