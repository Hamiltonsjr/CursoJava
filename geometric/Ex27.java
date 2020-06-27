package geometric;

import entidades.Triangle;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Informe o Triângulo de X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Informe o Trinângulo de Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triângulo X área : %.4f\n", areaX);
        System.out.printf("Triângulo Y área : %.4f\n", areaY);

        if (areaX > areaY){
            System.out.print("Triângulo X é o maior");
        }
        else{
            System.out.print("Triângulo Y é maior");
        }
        sc.close();
    }
}
