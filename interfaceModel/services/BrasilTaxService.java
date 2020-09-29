package interfaceModel.services;

// essa classe implementa a interface Taxservice uma classe genérica.

public class BrasilTaxService implements TaxService {

    public double tax(double amount){
        if(amount <= 100.0){
            return amount *0.2;

        }
        else {
            return amount * 0.15;
        }
    }
}
