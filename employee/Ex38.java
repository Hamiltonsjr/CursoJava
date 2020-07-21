package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lista recebe como argumento a classe Salary

        List<Salary> list = new ArrayList<>();

        System.out.print("Quantos Funcionários deseja cadastrar:");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){

            System.out.println();
            System.out.printf("Funcionário %d\n", i+1);
            System.out.print("ID:");
            int id = sc.nextInt();

            while (hasId(list, id)){
                System.out.println("Esse ID já existe tente novamente:");
                id = sc.nextInt();

            }
            System.out.print("Nome:");
            String name = sc.next();
            System.out.print("Salário:");
            double money = sc.nextDouble();
            list.add(new Salary(id, name, money));
        }
        System.out.println();
        System.out.print("Informe o ID do funcionário:");
        int number = sc.nextInt();

        // vai filtrar a lista procurando o primeiro ID igual se não achar vai retorna nulo

        Salary funcionario = list.stream().filter(x -> x.getId() == number).findFirst().orElse(null);
        if (funcionario == null){
            System.out.print("ID não existe.");
        }
        else {
            System.out.print("Porcentagem de aumento de salário:");
            double percentage = sc.nextDouble();
            funcionario.increase(percentage);
        }
        System.out.println();
        System.out.println("Lista De Funcionários:");
        for(Salary obj : list){
            System.out.println(obj);

        }
        sc.close();
    }

    // função para descobrir se já existe o ID na lista se for diferente de nulo pq já existe o funcionário.

    public static boolean hasId (List<Salary> list, int id){
        Salary funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
            }

}
