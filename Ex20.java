//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, valor;
        int in = 0, out = 0;

        System.out.print("Quantidade de leitura:");
        num = sc.nextInt();

        for (int i = 1; i<= num; i++){
            System.out.printf("Valor %d :", i);
            valor = sc.nextInt();
            if(valor < 10 || valor > 20){
                out += 1;
            }
            else {
                in += 1;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

        sc.close();
    }

    }
