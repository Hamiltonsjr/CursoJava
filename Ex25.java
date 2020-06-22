//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int num, raiz, cubo;

         System.out.print("Informe um número:");
         num = sc.nextInt();

         for(int i = 1; i <= num; i++){
             raiz = i * i;
             cubo = i * i * i;
             System.out.printf("%d %d %d\n", i, raiz, cubo);

         }
         sc.close();
    }
}
