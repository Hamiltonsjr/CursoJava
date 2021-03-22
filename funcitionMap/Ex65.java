package funcitionMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex65 {
    public static void main(String[] args) {
        /*
        * A partir de uma lista de produtos
        * gere uma nova lista contendo
        * os nomes dos produtos em caixa alta
        * */

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case",80.90));

        /*
        * Função "map" não e iguala a estrutura de dados Map
        * é uma função que aplica uma função a todos os elementos
        * de uma stream.
        * Conversões:
        * list para stream: .stream()
        * stream para list: .collect(Collectors.tolist())
        * */

        //INTERFACE
        List<String> nameInterface = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        nameInterface.forEach(System.out::println);

        //REFERENCE METHOD ESTÁTICO.

        List<String> nameStatic = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        nameStatic.forEach(System.out:: println);

        //REFERENCE METHOD NÂO ESTÁTICO.

        List<String> nameNoStatic = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());
        nameNoStatic.forEach(System.out::println);

        //EXPRESSÃO LAMBDA DECLARADA.

        Function<Product,String> function = product -> product.getName().toUpperCase(Locale.ROOT);
        List<String> nameFunc = list.stream().map(function).collect(Collectors.toList());
        nameFunc.forEach(System.out::println);

        //EXPRESSÃO LAMBDA INLINE.

        List<String> nameInLine = list.stream().map(product -> product.getName().toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        nameInLine.forEach(System.out::println);
    }
}
