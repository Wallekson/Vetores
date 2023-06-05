package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terá cada vetor? ");
        int n = sc.nextInt();
        String[] vectName = new String[n];
        int[] vectAge = new int[n];



        for (int i = 0; i < vectA.length; i++){
            System.out.println("Digite os valores do vetor A:");
            vectA[i] = sc.nextInt();
            System.out.println("Digite os valores do vetor A:");
            vectA[i] = sc.nextInt();



        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++){
            vectB[i] = sc.nextInt();


        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }


        sc.close();


    }
}
