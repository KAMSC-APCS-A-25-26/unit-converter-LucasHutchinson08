import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Convert time to total seconds");
            System.out.println();
            System.out.println("Enter hours: ");
            int hours = input.nextInt();
            System.out.println("Enter minutes: ");
            int minutes = input.nextInt();
            System.out.println("Enter seconds: ");
            int seconds = input.nextInt();
            System.out.println();
            int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
            System.out.println("Time Conversion:");
            System.out.println("Input: "+ hours + " hour, " + minutes + " minute, and " + seconds + " second");
            System.out.println("Total seconds: " + totalSeconds);
            System.out.println();
            System.out.println("Calculation: ");
            int hoursToSeconds = hours * 3600;
            System.out.println(hours + " hours x 3600 = " + hoursToSeconds + " seconds");
            int minutesToSeconds = minutes * 60;
            System.out.println(minutes + " minutes x 60 = " + minutesToSeconds + " seconds");
            System.out.println(seconds + " = seconds");
            System.out.println();
            System.out.print("Do you want to convert another time? (y/n): ");
            String choice = input.next().toLowerCase();

            switch(choice) {
                case "y":
                    break;

                case "n":
                    System.out.println("Goodbye!");
                    input.close();
                    return;

                default:
                    input.close();
                    return;
            }
        }
    }
}