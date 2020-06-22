//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        double a, b, div;

        System.out.println("Quantidade de leitura:");
        x = sc.nextInt();

        for(int i = 0; i < x; i++){
            System.out.printf("Valor %d:",i);
            a = sc.nextDouble();
            System.out.printf("Valor %d:", i);
            b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Divisão Impossivel");
            }
            else{
                div = a / b;

                System.out.println(div);
            }

        }
    sc.close();
    }

}
