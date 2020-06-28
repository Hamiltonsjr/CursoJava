// Crie um programa para ler a cotação do dólar, e depois um vaor em dólares a ser comprado por uma pessoa em reais.
// Informe quantos reias a pessoa vai pagar pelos dólares, considerando ainda que a pessoa téra que pagar 6% de iof,
// sobre o valor em dólar. Criar uma classe CurrencyConverter.
package converterCoin;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação do Dólar de hoje:");
        CurrencyConverter.money = sc.nextDouble();
        System.out.print("Quantos Dólares pretende comprar:");
        CurrencyConverter.purchase = sc.nextDouble();
        System.out.printf("Valor em Reais há pagar: R$ %.2f", CurrencyConverter.reais());

        sc.close();
    }
}
