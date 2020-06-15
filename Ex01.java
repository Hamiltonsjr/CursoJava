import  java.util.Locale;

public class Ex01 {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.00;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println("Product:");
        System.out.printf("%s which price is $ %.2f\n", product1, prince1);
        System.out.printf("%s which price is $ %.2f\n", product2, prince2);

        System.out.printf("Record: %d years old, %d and gender: %s\n", age, code, gender);
        System.out.printf("Measure with eight decimal place: %f\n", measure);
        System.out.printf("Rouded (three decimal place): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

    }
}
