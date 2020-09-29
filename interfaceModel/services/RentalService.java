package interfaceModel.services;

import interfaceModel.CarRental;
import interfaceModel.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHours;

    // interface genérica.

    private TaxService TaxService;

    public RentalService(Double pricePerDay, Double pricePerHours, TaxService TaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHours = pricePerHours;
        this.TaxService = TaxService;
    }

    public void processInvoice(CarRental carRental){

        // na classe carRental eu pego o momento inicial e o getTime transforme em milisegundos.
        long instantOne = carRental.getStart().getTime();
        long instantTwo = carRental.getFinish().getTime();

        // Double para ter certeza que vai retornar um número flutuate.

        double hours = (double) (instantTwo - instantOne) / 1000 / 60 / 60;

        double basicPayment;
        if(hours <= 12.00){

            // para calcular a hora para cima. EX 14:10 retorna 15h
             basicPayment = Math.ceil(hours) * pricePerHours;
        }
        else {
            basicPayment =Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = TaxService.tax(basicPayment); // basicPayment da classe Invoice

        // criado novo objeto de nota de pagamento e associei com o objeto aluguel.

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
