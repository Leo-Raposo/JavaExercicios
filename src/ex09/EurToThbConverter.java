package ex09;

public class EurToThbConverter implements CurrencyConverter {
    private static final double EUR_TO_THB_RATE = 37.5;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if ("EUR".equalsIgnoreCase(fromCurrency) && "THB".equalsIgnoreCase(toCurrency)) {
            return amount * EUR_TO_THB_RATE;
        } else {
            throw new IllegalArgumentException("Invalid currency conversion requested");
        }
    }
}


