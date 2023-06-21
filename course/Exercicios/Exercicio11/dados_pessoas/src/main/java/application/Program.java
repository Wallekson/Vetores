package application;

import entities.Users;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantMulher = 0, quantHomem = 0;
        double menorAltura, maiorAltura, somaMulheres = 0.0, mediaMulheres;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Users[] users = new Users[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().charAt(0);
            users[i] = new Users (altura,genero);
        }


        menorAltura = users[0].getAltura();
        for (int i = 0; i < n; i++){
            if (menorAltura > users[i].getAltura()){
                menorAltura = users[i].getAltura();

            }
        }

        maiorAltura = users[0].getAltura();
        for (int i = 0; i < n; i++){
            if (maiorAltura < users[i].getAltura()){
                maiorAltura = users[i].getAltura();

            }
        }


        for (int i = 0; i < n; i++){
            if (users[i].getGenero() == 'F'){
                somaMulheres += users[i].getAltura();
                quantMulher++;
            }
        }

        for (int i = 0; i < n; i++){
            if (users[i].getGenero() == 'M'){
                quantHomem++;
            }
        }

        mediaMulheres = somaMulheres / quantMulher;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf(" Media das alturas das mulheres = %.2f\n", mediaMulheres);
        System.out.print("Numero de homens = " + quantHomem);





    }
}
