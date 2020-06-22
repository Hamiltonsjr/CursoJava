//ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Informe um número:");
        num = sc.nextInt();

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                System.out.printf("Divisores %d\n", i);
            }
        }
        sc.close();
    }
}
