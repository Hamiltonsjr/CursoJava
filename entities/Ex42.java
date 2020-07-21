package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Enter Department's name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker Data:");
        System.out.print("Name:");
        String workerName = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary:");
        Double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName,
                WorkerLevel.valueOf(workerLevel),
                baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.printf("Enter Contract #%d data:\n", i+1);
            System.out.print("Date(DD/MM/YYYY):");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per Hours:");
            double valuePerHours = sc.nextDouble();
            System.out.print("Duration (Hours):");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHours, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calcule income (MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();


    }
}
