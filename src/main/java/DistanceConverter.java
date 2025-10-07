import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Choose conversion direction");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.println();

            System.out.println("Enter your choice (1, 2, or 3): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter distance in miles: ");
                    double distanceM = input.nextDouble();
                    System.out.println("Conversion Results:");
                    System.out.println("Miles: " + distanceM);
                    System.out.println("Kilometers: " + (distanceM * 1.60934));
                    System.out.println();
                    System.out.println();


                    break;
                case 2:
                    System.out.println("Enter distance in kilometers: ");
                    double distanceK = input.nextDouble();
                    System.out.println("Conversion Results: ");
                    System.out.println("Kilometers: " + distanceK);
                    System.out.println("Miles: " + (distanceK / 1.60934));
                    System.out.println();
                    System.out.println();


                    break;
                case 3:
                    System.out.print("Goodbye!");
                    System.out.println();


            }



        }


    }
}