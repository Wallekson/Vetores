package application;

import entities.Users;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantMulher, quantHomem;
        double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Users[] users = new Users[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);
            users[i] = new Users(altura, genero);
        }

        maiorAltura = users[0].getAltura();
        menorAltura = users[0].getAltura();
        for (int i = 0; i < n; i++) {
            if (users[i].getAltura() < menorAltura) {
                menorAltura = users[i].getAltura();

            }
            if (users[i].getAltura() > maiorAltura) {
                maiorAltura = users[i].getAltura();

            }
        }
        quantHomem = 0;
        quantMulher = 0;
        alturaFemTotal = 0;
        for (int i = 0; i < n; i++) {
            if (users[i].getGenero() == 'M') {
                quantHomem++;
            } else
                alturaFemTotal += users[i].getAltura();
            quantMulher++;
        }

        alturaFemMedia = alturaFemTotal / quantMulher;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf(" Media das alturas das mulheres = %.2f\n", alturaFemMedia);
        System.out.print("Numero de homens = " + quantHomem);

        sc.close();
        
    }
}
