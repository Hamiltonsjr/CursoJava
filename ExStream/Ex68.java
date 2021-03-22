package ExStream;

import stream.Product;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Ex68 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String strPath = scanner.nextLine();


        try (BufferedReader bufferedReader = new BufferedReader(new
                FileReader(strPath))){

            List<Product> list = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(" , ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            /* Preço médio de todos os produtos
            tranformei a lista e stream apliquei o map
            reduce para fazer a somatória do valores
            e dividi pelo tamanho da lista.
             * */

            double avg = list.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0,(x,y) -> x+y) / list.size();

            /*
            * Lista de nome com o preço abaixo da média
            * filter preço abaixa da media
            * map pegando o nome do produto
            * sorted colocando em em ordem alfabetica
            * collect tranformando a stream em lista
            * */
            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase(Locale.ROOT)
                    .compareTo(s2.toUpperCase(Locale.ROOT));

            List<String> name = list.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            name.forEach(System.out::println);


            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();

    }
}
