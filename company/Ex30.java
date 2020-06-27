package company;//Crie um programa para ler os dados de um funcionário(nome, salárioe imposto) em seguida mostrar os dados do funcionário
//em seguida aumentar o salário do funcionáro com bse em uma porcetagem dada e mostrar novamente
// os dados do funcionário use uma classe.
import java.util.Scanner;
import company.Employee;

public class Ex30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.print("Nome:");
        funcionario.name = sc.nextLine();
        System.out.print("Salário Bruto:");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Imposto:");
        funcionario.tax = sc.nextDouble();
        funcionario.toString();
        System.out.println(funcionario);
        System.out.print("Porcetagem acrescetar no salário:");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println("Dados Atualizado: " + funcionario);
        sc.close();
    }
}
