//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, dif;
        System.out.println("Produto A:");
        a = sc.nextInt();
        System.out.println("Produto B:");
        b = sc.nextInt();
        System.out.println("Produto C:");
        c = sc.nextInt();
        System.out.println("Produto D:");
        d = sc.nextInt();

        dif = a * b - c * d;
        System.out.printf("A Diferença dos produtos é : %d.", dif);
        sc.close();

    }

}
