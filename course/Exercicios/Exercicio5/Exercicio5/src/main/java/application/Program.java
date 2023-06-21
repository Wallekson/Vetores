package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaoMarior;
        double maior;

        System.out.print("Quantos numeros deseja digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();


        }

        maior = vect[0];
        posicaoMarior = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posicaoMarior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n" , maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", posicaoMarior);

        sc.close();
    }
}
