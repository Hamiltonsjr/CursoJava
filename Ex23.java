//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int fat = 1;

        System.out.print("Calculando Fatorial de:");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            fat = fat * i;

            System.out.println(fat);

        }
        sc.close();
    }
}
