// Criando 2 funçẽs.

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Informe 3 números:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
    }


    public static int max(int num1, int num2, int num3){ // função para descobri entre 3 números é o maior.
        int value;
        if (num1 > num2 && num1 > num3){
            value = num1;
        }
        else if (num2 > num3){
            value = num2;
        }
        else{
            value = num3;
        }
        return value;
    }


    public static void showResult(int text){  // função para formata o resultado.
        System.out.printf("Higher is = %d", text);
    }
}

