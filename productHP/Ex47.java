package productHP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex47 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of product:");
        int numberProduct = sc.nextInt();

        for(int i = 0; i<numberProduct; i++){
            System.out.printf("Product #%d data:\n",i+1);
            System.out.print("Common, used or imported (C/U/I) ? :");
            char esc = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price:");
            double price = sc.nextDouble();
            if(esc == 'c'){
                list.add(new Product(name, price));
            }
            else if (esc == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date date = sdf.parse(sc.next());

                list.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.print("Customs free:");
                double customsFree = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFree));

            }

        }

        System.out.println("PRICE TAGS");
        for (Product product: list) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
