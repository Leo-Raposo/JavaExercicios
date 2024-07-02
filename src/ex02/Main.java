package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.println("______________________");
            System.out.println("Choose the conversion: ");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    double fahr = sc.nextDouble();
                    double cels = TemperatureConverter.fahrenheitToCelsius(fahr);
                    System.out.println("Temperature in Celsius: " + cels);
                    break;
                case 3:
                    continueConversion = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        sc.close();
    }
}


