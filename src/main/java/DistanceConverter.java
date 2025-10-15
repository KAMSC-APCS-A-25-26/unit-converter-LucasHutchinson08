import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Distance Converter!");

        double MilesToKilometers = 1.60935;
        while (true) {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            System.out.println();

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter distance in miles: ");
                    double milesA = input.nextDouble();
                    double kilometersA = milesA * MilesToKilometers;
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Miles: " + milesA);
                    System.out.println("Kilometers: " + kilometersA);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter distance in kilometers: ");
                    double kilometersB = input.nextDouble();
                    double milesB = kilometersB / MilesToKilometers;
                    System.out.println();
                    System.out.println("Conversion Results: ");
                    System.out.println("Kilometers: " + kilometersB);
                    System.out.println("Miles: " + milesB);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid input! Please enter 1, 2, or 3.");
                    System.out.println();
                    break;

            }

        }

    }
}