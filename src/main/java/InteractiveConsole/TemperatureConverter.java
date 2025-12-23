package InteractiveConsole;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTemperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F");
    }


  public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is " + celsius + "°C");
    }
}
