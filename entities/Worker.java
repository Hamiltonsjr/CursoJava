package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    // Atributos basicos

    private String name;
    private WorkerLevel level;
    private Double basealary;

    // Associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    // Não inserir a lista no construtor

    public Worker(String name, WorkerLevel level, Double basealary, Department department) {
        this.name = name;
        this.level = level;
        this.basealary = basealary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBasealary() {
        return basealary;
    }

    public void setBasealary(Double basealary) {
        this.basealary = basealary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts(){
        return contracts;
    }
    // adicionar um contrato na lista de contratos
    public void addContract(HourContract contract){
        contracts.add(contract);
    }


    // remover um contrato da lista de contratos
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    // Implementação da classe

    public double income(int year, int month){
        double sum = basealary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }

        }
        return sum;
    }

}

