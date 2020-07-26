package herancaPolimorfismo;

public class Ex45 {

    public static void main(String[] args) {

        Account account = new Account(1001,"Alex",0.0 );
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria",0.0,500.0);

        // UPCASTING

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100);

        if (account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount)account3;
            account5.loan(200.0);
            System.out.println("Loan");
        }
        if (account3 instanceof SavingAccount){
            SavingAccount account5 = (SavingAccount)account3;
            account5.updateBalance();
            System.out.println("Update");

        }

        // SOBREPOSIÇÃO

        Account account6 = new Account(1001, "Alex", 1000.0);
        account6.withdraw(200.0);
        System.out.println(account6.getBalance());

        Account account7 = new SavingAccount(1002, "Maria", 1000.0,0.01);
        account7.withdraw(200.0);
        System.out.println(account7.getBalance());

        Account account8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        account8.withdraw(200.0);
        System.out.println(account8.getBalance());


    }
}
