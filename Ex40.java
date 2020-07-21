// Crie um programa para ler dois números inteiros M e N, e depois ler
// uma matriz de M linhas por N colunas contendo números inteiros, Em seguida ler um número de x
// mostrar os valores á esquerda, acima á direita e abaixo de x, quando houver.


import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Números de Linhas:");
        int m = sc.nextInt();
        System.out.print("Números de Coluna:");
        int n = sc.nextInt();

        int [][] matriz = new int[m][n];

        for(int linha = 0; linha<m; linha++){
            for(int coluna = 0; coluna<n; coluna++){
                System.out.printf("Linha [%d] Coluna [%d]: ", linha, coluna);
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Informe um número existente na matriz:");
        int x = sc.nextInt();

        for(int linha = 0; linha<m; linha++){
            for(int coluna = 0; coluna<n; coluna++){
                if(matriz[linha][coluna] == x){
                    System.out.printf("Posição [%d][%d]\n", linha, coluna);
                    if(coluna > 0){
                        System.out.println("Esquerda: " + matriz[linha][coluna-1]);
                    }
                    if(linha > 0){
                        System.out.println("Acima: " + matriz[linha -1][coluna]);
                    }
                    if(coluna < matriz[linha].length -1){
                        System.out.println("Direita " + matriz[linha][coluna +1]);

                    }
                    if(linha < matriz.length-1){
                        System.out.println("Abaixo: " + matriz[linha+1][coluna]);
                    }
                }

            }
        }
        sc.close();
    }
}
