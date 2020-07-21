// Crie um programa para ler um númeor inteiro N e os dados (nome e preço) de N produtos.
// Armazene os N produtos em um vetor em seguida mostrar o preço médio dos produtos.
package product;

import application.entities.Product;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Números de produtos:");
        int n = sc.nextInt();
        Vetor[] vect = new Vetor[n];

        // .length para ler o tamanho do vetor

        for (int i = 0; i < vect.length; i++){
            System.out.print("Nome do Produto:");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Preço do Produto:");
            double price = sc.nextDouble();
            vect[i] = new Vetor(name, price);

            }

        double sum = 0;
        for(int i = 0; i< vect.length; i++){
            // acessando o vetor da posição I .getPrice para pegar somente o valor
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("A média dos valores é R$ %.2f", avg);

        sc.close();
    }
}
