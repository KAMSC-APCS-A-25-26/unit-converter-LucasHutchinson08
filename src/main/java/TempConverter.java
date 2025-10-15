import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Enter your choice (1, 2, or 3): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    double temperatureF = input.nextDouble();
                    System.out.println("Conversion Results:");
                    System.out.println("Fahrenheit: " + temperatureF);
                    System.out.println("Celsius: " + ((temperatureF - 32)*5/9));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter temperature in Celsius: ");
                    double temperatureC = input.nextDouble();
                    System.out.println("Conversion Results:");
                    System.out.println("Celsius: " + temperatureC);
                    System.out.println("Fahrenheit: " + ((temperatureC * 9/5)+32));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    System.out.println();
                    return;

                    default:
                    System.out.println("Invalid input. Please enter a valid input.");
                    System.out.println();
                    break;

            }

        }
    }}