package application;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros deseja digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        soma = 0;
        for(int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

         media = soma / vect.length;


        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA = ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media){
                System.out.printf("%.1f\n", vect[i]);
            }
        }

    }
}
