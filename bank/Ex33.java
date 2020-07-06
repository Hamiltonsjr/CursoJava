package bank;

import java.util.Locale;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        Account account; // declarar a variavel primeiro para ser utilizada em qualquer parte do prog.

        System.out.print("Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (Y/N) ?");
        char opt = sc.next().charAt(0);

        if(opt == 'y'){
            System.out.print("Enter initial deposit value:");
            double initialValue = sc.nextDouble();
            account = new Account(number, holder, initialValue);
        }else{
            account = new Account(number, holder);
        }
        System.out.println("Account data:");
        System.out.println(account);
        System.out.print("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Updated account data:\n");
        System.out.println(account);
        System.out.print("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        System.out.print("Updated account data:");
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();
    }
}
