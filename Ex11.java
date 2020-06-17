//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Ex11{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Digite um Número:");
        number1 = sc.nextInt();

        System.out.print("Digite Outro Número:");
        number2 = sc.nextInt();

        if (number1 % number2 == 0 || number2 % number1 == 0){
            System.out.println("Números Multiplos");
        }
        else{
            System.out.println("NÃO são Multiplos");
        }
    sc.close();
    }
}