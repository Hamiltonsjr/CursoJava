import java.util.Scanner;

public class Ex15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double imposto, salario;

        System.out.print("Informe o Salário:");
        salario = sc.nextDouble();

        if (salario <= 2000.0){
            System.out.println("Insento");
        }
        else if (salario <= 3000.0){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("Imposto de 8%% total:  R$%.2f ", imposto);
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Imposto de 18%% total: R$%.2f", imposto);
        }
        else  if (salario > 4500.0){
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18;
            System.out.printf("Imposto de 28%% total: R$%.2f", imposto);
        }
        sc.close();
    }
}