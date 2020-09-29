package interfaceModel;

import interfaceModel.services.BrasilTaxService;
import interfaceModel.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex58 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd//MM/yyyy HH:ss");

        System.out.println("Enter rental data:");
        System.out.print("Car model:");
        String carModel = scanner.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss)");
        Date start = simpleDateFormat.parse(scanner.nextLine());
        System.out.print("Return (dd/mm/yyyy hh:ss)");
        Date finish = simpleDateFormat.parse(scanner.nextLine());

        CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Enter price per hours:");
        double priceHours = scanner.nextDouble();
        System.out.print("Enter price per day:");
        double priceDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(priceDay,priceHours, new BrasilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("INVOICE");
        System.out.println("Basic payment:" + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax :" + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total Payment:" + String.format("%.2f",carRental.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
