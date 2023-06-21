package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantpares = 0, soma = 0;
        double mediapares;

        System.out.print("Quantos numeros deseja digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];


        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                quantpares++;
            }
        }
        if (quantpares == 0) {
            System.out.println("NENHUM NUMERO PAR ");

        } else {
            mediapares = soma / quantpares;
            System.out.printf("MEDIA DOS PARES = %.1f", mediapares);
        }

        sc.close();
    }
}


