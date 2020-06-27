package company;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public String toString(){
        return name + String.format(" R$ %.2f", NetSalary());
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

}
