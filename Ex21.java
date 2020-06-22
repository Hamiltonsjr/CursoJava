//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        double num1, num2, num3, media;

        System.out.print("Quantidade de leitura");
        x = sc.nextInt();

        for(int i = 0; i < x; i++){
            System.out.printf("Valor %d :",i);
            num1 = sc.nextDouble();
            System.out.printf("Valor %d :", i);
            num2 = sc.nextDouble();
            System.out.printf("Valor %d :", i);
            num3 = sc.nextDouble();

            media = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10.0;
            System.out.printf("Média %.2f\n", media);
        }
    sc.close();
    }
}
