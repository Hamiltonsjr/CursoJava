package bank;

public class Account {

    private int number;
    private String holder;
    private double balance;


    // quando for privete tem que criar um construtor.

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialBalance) {
        this.number = number;
        this.holder = holder;
        deposit(initialBalance);
    }
    // get para atribuir um valor // valores que não altera valor não precisa de set.

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
    // set para poder modificar o valor
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    // método para acrescentar o valor na conta

    public void deposit(double amount){ //
        balance += amount;

    }
    // método para realizar saque na conta mais a taxa de 5,00

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account " + number +
                ", Holder: " + holder +
                " Balance: $ " + String.format("%.2f", balance);
    }
}
