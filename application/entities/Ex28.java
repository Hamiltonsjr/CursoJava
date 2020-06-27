package application.entities;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Nome do Produto:");
        product.name = sc.next();
        System.out.print("Preço do Produto:");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em Estoque:");
        product.quantity = sc.nextInt();

        System.out.println(product);
        System.out.println();
        System.out.print("Digite um número para adicionar em estoque:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.print("Dados Atualizados --> ");
        System.out.println(product);
        System.out.println();

        System.out.print("Quantidade a ser removida do estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println();

        System.out.print("Dados Atualizados --> ");
        System.out.println(product);

        sc.close();
    }
}
