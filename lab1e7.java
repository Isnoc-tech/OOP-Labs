import java.util.Scanner;

public class AddAndAverage {

    public static void main(String[] args) {
        // Declare two integer variables to store the numbers to be added
        int num1, num2;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the first integer from the user
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        // Read the second integer from the user
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        // Calculate the sum of the two integers
        int sum = num1 + num2;

        // Calculate the average of the two integers
        double average = (double) sum / 2;

        // Display the sum and the average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the scanner
        scanner.close();
    }
}
