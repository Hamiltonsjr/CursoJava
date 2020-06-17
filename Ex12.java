//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex12{
    public static void main(String[] args) {

        int duracao, first, end;

        Scanner sc = new Scanner(System.in);
        System.out.print("Começo da Partida:");
        first = sc.nextInt();
        System.out.print("Término da Partida:");
        end = sc.nextInt();

        if (first < end){
            duracao = end - first;
        }
        else{
            duracao = 24 - first + end;
        }
        System.out.printf("A Partida teve o total de %d horas.", duracao);
        sc.close();
    }
}
