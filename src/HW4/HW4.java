package HW4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("What's your choice?");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input Fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius is " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input Celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit is " + celsiusToFahrenheit(celsius));
                    break;
                default:
                    System.exit(0);
            }
        } while (choice!=0);
    }
    public static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }

    public static double celsiusToFahrenheit (double celsius) {
        double fahrenheit = (9.0/5)*celsius+32;
        return fahrenheit;
    }
}


