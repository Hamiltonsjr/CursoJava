package setEx;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex61 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudante no curso A ?:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Codigo do aluno %d:", i + 1);
            int number = scanner.nextInt();

            a.add(number);
        }

        System.out.print("Quantos estudantes no curso B ?:");
        n = scanner.nextInt();
        for (int i =0; i < n; i++){
            System.out.printf("Código aluno %d:", i + 1);
            int number = scanner.nextInt();

            b.add(number);

        }

        System.out.print("Quantos estudantes nno curso C ?:");
        n = scanner.nextInt();
        for(int i = 0; i < n ; i++){
            System.out.printf("Código aluno %d:", i + 1);
            int number = scanner.nextInt();

            c.add(number);

        }

        // Compara todos os elementos entre as listas e retonar todos sem repetir o mesmo código do aluno.

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.print("Total de estudantes : " + total.size());

        scanner.close();
    }

}
