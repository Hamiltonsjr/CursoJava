package employee;

public class Salary {

    private String name;
    private Integer id;
    private Double money;

    public Salary(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Salary(String name, Integer id, double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public void increase(double porcento){
        money += money * porcento / 100;

    }

    public String toString(){
        return id + " - " +
                name + " - " +
                String.format("R$ %.2f", money);
    }
}
