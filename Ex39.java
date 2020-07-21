// Crie um programa para ler um número inteiro N e uma matriz de ordem N contendo
// números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negtivos


import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho da Matriz:");
        int tamanho  = sc.nextInt();

        int [][] matriz = new int[tamanho][tamanho];

        for (int linha = 0; linha<matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){

                // tamanho do vetor correspondente a linha matriz[linha].length

                System.out.printf("Linha [%d] Coluna[%d]:", linha, coluna);
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=");
        System.out.println("Diagonal Principal");
        for (int i = 0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " " );
        }
        System.out.println("-=-=-=-=-=-=-=-=-=");

        int count = 0;
        for(int linha = 0; linha<matriz.length; linha++){
            for(int coluna =0; coluna<matriz[linha].length; coluna++){
                if(matriz[linha][coluna] < 0){
                    count++;
                }

            }
        }
        System.out.println("Números Negátivos:");
        System.out.printf("%d",count );

        sc.close();

    }
}
