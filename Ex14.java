//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){

        double num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:");
        num = sc.nextDouble();

        if (num >= 0 && num <= 25){
            System.out.println("Interválo de (0,25)");
        }
        if (num > 25 && num <= 50){
            System.out.println("Interválo de (25,50)");
        }
        if (num > 50 && num <=75){
            System.out.println("Interválo de (50,75)");
        }
        if (num > 75 && num <= 100){
            System.out.println("Interválo de (75,100)");
        }
        else{
            System.out.println("Número fora de Interválo");
        }
    sc.close();
    }
}
