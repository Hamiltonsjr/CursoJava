package exAbstrasto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.printf("TAX PAYER #%d Data:\n", i+1);
            System.out.print("Individual or Company (I/C) :");
            char type = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income:");
            Double anualIncome = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures:");
                double health = sc.nextDouble();
                list.add(new Individual(name,anualIncome,health));

            }
            else {
                System.out.print("Number of employees:");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name,anualIncome,numberEmployees));

            }

        }

        double sum = 0;
        System.out.println();
        System.out.print("TAXES PAID\n");
        for (TaxPayer taxPayer: list) {
            double tax = taxPayer.tax();
            System.out.println(taxPayer.getName()
            + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.print("TOTAL TAXES : $ " + String.format("%.2f", sum));

        sc.close();
    }
}
