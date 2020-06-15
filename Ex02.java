import java.util.Scanner; // lendo 2 válores inteiros e depois mostrar na tela a soma entre eles

public class Ex02 {
    public static void main(String[] args){
        System.out.println("Enter an integer:");

        int num1, num2, total;

        Scanner sc = new Scanner (System.in);
        num1 = sc.nextInt();

        System.out.println("Enter another integer:");
        num2 = sc.nextInt();

        total = num1 + num2;

        System.out.printf("The sum between %d and %d is %d\n", num1, num2, total);
        System.out.println("Bye !");
        sc.close();
    }
}
