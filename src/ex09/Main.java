package ex09;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter usdToEur = new UsdToEurConverter();
        CurrencyConverter eurToThb = new EurToThbConverter();

        double usdAmount = 100;
        double eurAmount = usdToEur.convert(usdAmount, "USD", "EUR");
        System.out.println(usdAmount + " USD is " + eurAmount + " EUR");

        double thbAmount = eurToThb.convert(eurAmount, "EUR", "THB");
        System.out.println(eurAmount + " EUR is " + thbAmount + " THB");
    }
}


