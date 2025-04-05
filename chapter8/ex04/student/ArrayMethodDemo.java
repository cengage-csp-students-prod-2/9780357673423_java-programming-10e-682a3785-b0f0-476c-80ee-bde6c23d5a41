import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int LIMIT = 12;
        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int belowLimitCount = 0;

        // Input
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            if (numbers[i] < LIMIT) {
                belowLimitCount++;
            }
        }

        // Display numbers in original order
        System.out.print("The numbers are  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();

        // Display numbers in reverse order
        System.out.print("The numbers in reverse order are  ");
        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();

        // Sum and average
        System.out.println("The sum of all numbers is " + sum);
        System.out.println(numbers[0] + " " + numbers[3] + " are less than the limit " + LIMIT);

        double average = (double) sum / SIZE;
        System.out.printf("The average is %.1f%n", average);

        // Display numbers greater than average
        System.out.print("Numbers greater than the average: ");
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] > average) {
                System.out.print(numbers[i] + "  ");
            }
        }
        System.out.println();
    }
}