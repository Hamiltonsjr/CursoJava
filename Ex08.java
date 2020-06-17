import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.print("Quantas horas?");
        hora = sc.nextInt();


        if (hora <= 12) {
            System.out.println("Boa Dia !");
        }
        else if (hora <= 18) {
            System.out.println("Bom Tarde!");
        }
        else {
            System.out.println("Bom Noite!");
        }
        sc.close();
    }
}
