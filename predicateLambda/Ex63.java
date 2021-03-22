package predicateLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex63 {

    public static void main(String[] args) {

        /* A partir de uma lista de produtos, remova da lista somente
        * aqueles cujo preço minimo seja 100. */


        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD case", 80.90));

        /*Interface funcional
        pq ela só tem um método abstrato
        * */

        list.removeIf(new ProductPredicate());


        /* Referência para método
        coloco na classe aonde o método está.
        * */
        list.removeIf(Product::staticProductPredicate);

        // Expressão Lambda Declarada

        Predicate<Product> predicate = product -> product.getPrice() >= 100;

        list.removeIf(predicate);

        // Expressão lambda inLine

        list.removeIf(product -> product.getPrice() >=100);

        for (Product p : list)
            System.out.println(p);{
            }
    }
}
