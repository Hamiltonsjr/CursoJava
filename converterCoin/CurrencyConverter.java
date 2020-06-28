package converterCoin;

public class CurrencyConverter {

    public static double money;
    public static double purchase;

    public static double converter(){
        return money * purchase;
    }
    public static double reais(){
        return converter() * 6 / 100 + converter();
    }

}
