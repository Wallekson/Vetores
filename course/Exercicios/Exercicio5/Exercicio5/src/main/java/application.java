import java.util.Locale;
import java.util.Scanner;

public class application {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double maior = 0.0;
        int posicao = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();


        }
        double num;
        for (int i = 0; i < vect.length; i++) {
            num = vect[i];
            if (num > vect[i]) {
                maior = num;
                posicao = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
    }
}
