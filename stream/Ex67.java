package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex67 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        // Criando uma Stream apartir de uma Coleção no caso uma lista.
        Stream<Integer> streamOne = list.stream();
        System.out.println(Arrays.toString(streamOne.toArray()));

        // Criando uma Stream usando o Stream.of
        Stream<String> streamTwo = Stream.of("Maria", "Alex","João");
        System.out.println(Arrays.toString(streamTwo.toArray()));

        // Criando uma Stream usando uma função de interação.
        Stream<Integer> streamThree = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(streamThree.limit(10).toArray()));



    }
}
