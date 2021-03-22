package comparatorLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {


    // função programação funcional

    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());

    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Notebook",1200.00));
        list.add(new Product("Tablet",450.00));

        // classe anônima dentro do prog. principal  para comparar os objetos.

       /* Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }
        };

        list.sort(comp);



        // Expressão lambda função anônima.

        Comparator<Product> comp2 = (p1 , p2) ->{
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp2);



        // Expressão lambda com apenas uma linha não usa as chaves.

        Comparator<Product> comp3 = (p3, p4) -> p3.getName().toUpperCase().compareTo(p4.getName().toUpperCase());




        // Vai ordena todos os objetos na lista com o método sort passando o Mycomparator.

        list.sort(new MyComparator());



        // Comparando dentro no método sort.

        list.sort((product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));

        for (Product p: list) {
            System.out.print(p);

        }*/


        // referensa para a função compareProducts

        list.sort(Program::compareProducts);

        list.forEach(System.out::println);


    }
}
