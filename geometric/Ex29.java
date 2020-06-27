package geometric;// Crie um progrma para ler os valores da largura e altura de um Retângulo, em seguida
// mostre na tela o valor de sua aréa, perímetro e diagonal usando uma classe.

import entidades.Retangle;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cod;

        Retangle retangle = new Retangle();
        System.out.print("Informe a altura do retângulo:");
        retangle.width = sc.nextDouble();
        System.out.print("Informe a larguta do retângulo:");
        retangle.height = sc.nextDouble();

        System.out.print("[1] Aréa\n[2] Perímetro\n[3] Diagonal\n[4] Sair\n");
        cod = sc.nextInt();

        while (cod != 4){
            if(cod == 1){
                retangle.valueArea();
                System.out.printf("Valor da Aréa: %.2f\n",retangle.valueArea());
            }
            else if(cod == 2){
                retangle.perimeter();
                System.out.printf("Valor da Perímetro: %.2f\n",retangle.perimeter());
            }
            else if (cod == 3){
                retangle.diagonal();
                System.out.printf("Valor da Diagonal: %.2f\n",retangle.diagonal());
            }
            else if (cod > 4) {
                System.out.print("Informe um código válido [1 a 4]:");
                cod = sc.nextInt();
            }
            else if (cod == 4){
                break;
            }
            System.out.print("[1] Aréa\n[2] Perímetro\n[3] Diagonal\n[4] Sair\n");
            cod = sc.nextInt();

        }
        System.out.print("Fim do Programa.");

        sc.close();
    }
}
