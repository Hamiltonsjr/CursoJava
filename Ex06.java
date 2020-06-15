//Fazer um programa para ler o código de uma produto 1, a quantidade do produto 1, o valor unitário de cada produto 1, o
//código do produto 2, a quantidade de produtos 2 e o valor unitário de cada produto 2.
// Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qt1, qt2;
        double value1, value2,total;

        System.out.print("COD Produto 1:");
        cod1 = sc.nextInt();
        System.out.print("Quantidade da compra:");
        qt1 = sc.nextInt();
        System.out.print("Valor Unitário do produto:");
        value1 = sc.nextDouble();

        System.out.print("COD Produto 2:");
        cod2 = sc.nextInt();
        System.out.print("Quantidade da compra:");
        qt2 = sc.nextInt();
        System.out.print("valor Unitário do produto:");
        value2 = sc.nextDouble();

        total = qt1 * value1 + qt2 * value2;

        System.out.printf("Total do Produto 1\n\n[%d] \tR$%.2f\n\n", cod1, value1);
        System.out.printf("Total do Produto 2\n\n[%d] \tR$%.2f\n\n", cod2, value2);
        System.out.printf("O valor Total a ser pago: R$ %.2f reais\n", total);
        sc.close();

    }
}
