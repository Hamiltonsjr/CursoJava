//Fazer um programa que leia o Nome de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o nome e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        String name;
        double hours, valueHoursWorking,salary;

        System.out.print("Nome do funcionario:");
        name = sc.next();
        System.out.print("Números de horas trabalhadas:");
        hours = sc.nextDouble();
        System.out.print("Valor da hora trabalhada:");
        valueHoursWorking = sc.nextDouble();

        salary = hours * valueHoursWorking;

        System.out.printf("O Funcionário %s Vai receber de salário R$ %.2f reais\n", name, salary);
        sc.close();
    }
}
