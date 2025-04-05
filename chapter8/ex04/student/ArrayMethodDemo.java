import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args) {
        // Declare an array to store the numbers
        int[] numbers = new int[10];

        // Scanner to take input from the user
        Scanner input = new Scanner(System.in);

        // Input 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
        }

        // Display the numbers and their details
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);  // Define the limit 12
        double average = calculateAverage(numbers);
        System.out.println("The average is " + average);
        displayHigherThanAverage(numbers, average);
    }

    // Method to display all numbers
    public static void display(int[] numbers) {
        System.out.print("The numbers are ");
        for (int num : numbers) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    // Method to display numbers in reverse order
    public static void displayReverse(int[] numbers) {
        System.out.print("The numbers in reverse order are ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
    }

    // Method to display the sum of all numbers
    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of all numbers is " + sum);
    }

    // Method to display numbers less than the given limit
    public static void displayLessThan(int[] numbers, int limit) {
        System.out.print("The numbers less than the limit " + limit + " are ");
        boolean found = false;
        for (int num : numbers) {
            if (num < limit) {
                System.out.print(num + "  ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Method to display numbers greater than the average
    public static void displayHigherThanAverage(int[] numbers, double average) {
        System.out.print("The numbers greater than the average " + average + " are ");
        boolean found = false;
        for (int num : numbers) {
            if (num > average) {
                System.out.print(num + "  ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Method to calculate the average
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / (double) numbers.length;
    }
}