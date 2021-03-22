package comparatorLambda;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        // comparando 2 produtos pelo nome e passando eles para maiusculos.

        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
