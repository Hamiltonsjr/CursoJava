//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;


public class Ex17 {
    public static void main(String[] args){

        int x, y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenada 1:");
        x = sc.nextInt();
        System.out.print("Coordenada 2:");
        y = sc.nextInt();

        while (x != 0 && y != 0){
            System.out.printf(" X = %d e Y = %d\n", x, y);
            System.out.print("Coordenada 1:");
            x = sc.nextInt();
            System.out.print("Coordenada 2:");
            y = sc.nextInt();

        }

        sc.close();

    }
}
