package application;

import java.util.IllegalFormatCodePointException;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double avg = soma / vect.length;

        System.out.printf("MEDIA DO VETOR = %.3f", avg);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA = ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg){
                System.out.println(vect[i]);
            }
        }

    }
}
