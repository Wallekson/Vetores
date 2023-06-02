package application;

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
            if (vect[i] % 2 == 0){
                soma += vect[i];
            }
        }


        double avg = soma / vect.length;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 1){
                System.out.println("NENHUM NUMERO PAR ");
            }else {
                System.out.printf("MEDIA DOS PARES = %.1f", avg);
            }
        }




    }
}


