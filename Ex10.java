//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Digite um Número:");
        number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Número PAR");
        }
        else{
            System.out.println("Número IMPAR");
        }
    sc.close();
    }
}