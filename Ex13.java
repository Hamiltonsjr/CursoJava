//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cod, qtd, x;
        double prince;

        System.out.print("Código do Produto:");
        cod = sc.nextInt();
        System.out.print("Quantidade do Produto:");
        qtd = sc.nextInt();

        if (cod == 1) {
            prince = qtd * 4.0;
            System.out.println("COD\t\tPRODUTO\t\tQTD\t\tTOTAL");
            System.out.printf("%d\t\tLanche 1\t%d\t\tR$ %.2f", cod, qtd, prince);
        }
        else if (cod == 2) {
            prince = qtd + 4.5;
            System.out.println("COD\t\tPRODUTO\t\tQTD\t\tTOTAL");
            System.out.printf("%d\t\tLanche 2\t%d\t\tR$ %.2f", cod, qtd, prince);
        }
        else if (cod == 3){
            prince = qtd * 5.0;
            System.out.println("COD\t\tPRODUTO\t\tQTD\t\tTOTAL");
            System.out.printf("%d\t\tLanche 3\t%d\t\tR$ %.2f", cod, qtd, prince);
        }
        else if (cod == 4){
            prince = qtd * 2.0;
            System.out.println("COD\t\tPRODUTO\t\tQTD\t\tTOTAL");
            System.out.printf("%d\t\tLanche 3\t%d\t\tR$ %.2f", cod, qtd, prince);
        }
        else if (cod == 5){
            prince = qtd * 1.5;
            System.out.println("COD\t\tPRODUTO\t\tQTD\t\tTOTAL");
            System.out.printf("%d\t\tLanche 5\t%d\t\tR$ %.2f", cod, qtd, prince);
        }
        else{
            System.out.println("ERRO... NÚMERO INVÁLIDO");
        }
        sc.close();
    }

}

