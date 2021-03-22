package funcaoRecebeFuncao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Ex66 {
    public static void main(String[] args) {

        /*
        * A partir de uma lista calcule a soma dos preços
        * somente dos produtos cujo noome começa com "T"
        * */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case",80.90));

        ProductService productService = new ProductService();

        double sum = productService.filteredSum(list, product -> product.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));



    }
}
