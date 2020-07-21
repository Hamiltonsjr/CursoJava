// Crie um programa que recebar  X nomes  e forma uma lista add ou remova elementos mostra tamanho da lista
// add elemento em posição desejada da lista


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex37 {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();

       list.add("Maria");
       list.add("João");
       list.add("Carlos");
       list.add("Roberto");

       for(String lista : list){
           System.out.println(lista);
       }
       System.out.println("-=-=-=-=-=-=-=-=-=-=");
       //list.remove("Roberto");
        //list.remove(3);
       list.removeIf(lista -> lista.charAt(0) == 'R');// Predicado vai retornar verdadeiro ou falso.
       System.out.println(list);
       System.out.println("-=-=-=-=-=-=-=-=-=-=");

       System.out.println("ADD ELEMENTO:");
       list.add(3, "Pedro");
       System.out.println(list);
       System.out.println("-=-=-=-=-=-=-=-=-=-=");

       System.out.println("Posição de um elemento");
       System.out.println(list.indexOf("Maria"));// se não ouver o elemento na lista vai retonar -1.
       System.out.println("-=-=-=-=-=-=-=-=-=-=");

       System.out.println("Filtrar os Elementos da lista");
       List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
       System.out.println(result);
       System.out.println("-=-=-=-=-=-=-=-=-=-=");

       System.out.println("Primeiro elemento da lista com Letra C");
       // findFirst().orElse vai varer lista e se não achar o elemento vai retornar nulo.
       String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
       System.out.println(name);
    }

}
