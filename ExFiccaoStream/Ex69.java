package ExFiccaoStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex69 {

    /*
    * Ler dados (Nome, email e salário)
    * mostrar em ordem alfabética o email dos funcionario superior a um, dado valor
    * mostrar a soma dos sálarios dos funcionários cujo nome começa com a letra "m'
    * */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();


            List<String> emailEmployee = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emailEmployee.forEach(System.out::println);


            double sum = list.stream()
                    .filter(employee -> employee.getName() == "M")
                    .map(employee -> employee.getSalary())
                    .reduce(0.0,(x,y) -> x + y);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        scanner.close();
    }
}
