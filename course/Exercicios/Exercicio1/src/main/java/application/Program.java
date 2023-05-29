package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        int negNum = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] < 0){
                negNum = vect[i];
            }
            System.out.println("NUMEROS NEGATIVOS");
            System.out.println(negNum);
        }

    }

}
