package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex64 {

    /*
     * A parir de uma lista de produtos
     * aumente o preços dos produtos em 10%.
     * */

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // For percorrrendo cada elementa da lista e aumenta 10%.
        // IMPLEMENTAÇÃO DA INTERFACE.

        list.forEach(new PriceUpdate());
        list.forEach(System.out :: println);

        //REFERENCE METHOD ESTÁTICO.

        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out :: println);

        //REFERENCE METHOD NÃO ESTÁTICO.

        list.forEach(Product::noStaticPriceUpdate);
        list.forEach(System.out :: println);

        //Expressão Lambda declarada

        Consumer<Product> consumer = product -> {
            product.setPrice(product.getPrice() * 1.1);
        };
        list.forEach(consumer);

        //Expressão Lambda inline

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

    }
}
