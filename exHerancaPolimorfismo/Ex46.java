package exHerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d\n", i + 1);
            System.out.print("Outsourced (Y/N):");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours:");
            int hours = sc.nextInt();
            System.out.print("Value per Hour:");
            double valuePerHour = sc.nextDouble();
            if (outsourced == 'y') {
                System.out.print("Additional charge:");
                double additionalCharge = sc.nextDouble();

                //Employee employee = new OutsourceEmployee(name,hours,valuePerHour,additionalCharge);

                list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println("--=--=--=--=--=--=");
        System.out.println("PAYMENTS");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}


