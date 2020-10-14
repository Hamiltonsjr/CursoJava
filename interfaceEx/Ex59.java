package interfaceEx;

import interfaceEx.serviceDesign.ContractService;
import interfaceEx.serviceDesign.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex59 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter contract data");
        System.out.print("Number:");
        int number = scanner.nextInt();
        System.out.print("Date (dd/MM/yyyy):");
        Date date = simpleDateFormat.parse(scanner.next());
        System.out.print("Contract value:");
        double contractValue = scanner.nextDouble();

        // Primeiro o contrato.
        Contract contract = new Contract(number,date,contractValue);

        System.out.print("Enter number of installments:");
        int installments = scanner.nextInt();

        // Segundo O serviço passando a forma de pagamento
        ContractService contractService = new ContractService(new PaypalService());

        // Terceiro dentro da variavel criado use o método criado.

        contractService.processContract(contract,installments);

        System.out.println("Installments:");
        for(Installment installment: contract.getInstallments()){
            System.out.println(installment);

        }

        scanner.close();
    }
}
