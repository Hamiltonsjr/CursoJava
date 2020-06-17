//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Analisando um número:");
        number = sc.nextInt();
        if (number > 0){
            System.out.println("Número Positivo");
        }
        else{
            System.out.println("Número Negativo");
        }
    sc.close();
    }

}