package ex09;

public class UsdToEurConverter implements CurrencyConverter {
    private static final double USD_TO_EUR_RATE = 0.85;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if ("USD".equalsIgnoreCase(fromCurrency) && "EUR".equalsIgnoreCase(toCurrency)) {
            return amount * USD_TO_EUR_RATE;
        } else {
            throw new IllegalArgumentException("Invalid currency conversion requested");
        }
    }
}


