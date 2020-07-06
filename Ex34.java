// Crie um vetor para calcular a média de altura de X pessoas.

import java.util.Locale;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int vectNumber;

        System.out.print("Número do vetor:");
        vectNumber = sc.nextInt();

        double[] vect = new double[vectNumber];

        for (int i=0; i<vectNumber; i++){
            System.out.print("Informe uma altura:");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
            for(int i = 0; i < vectNumber; i++) {
                sum += vect[i];
            }

        double arg = sum / vectNumber;

        System.out.printf("Média de altura das pessoas é : %.2f", arg);


        sc.close();
    }
}
