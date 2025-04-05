import java.util.*;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 10;
        final int LIMIT = 12;
        int[] numbers = new int[TOTAL_NUMBERS];
        int sum = 0;
        Scanner input = new Scanner(System.in);

        
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        
        System.out.print("The numbers are ");
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();

        
        System.out.print("The numbers in reverse order are ");
        for (int i = TOTAL_NUMBERS - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();

        
        System.out.println("The sum of all numbers is " + sum);

        
        int belowLimitCount = 0;
        StringBuilder belowLimitValues = new StringBuilder();
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            if (numbers[i] < LIMIT) {
                belowLimitCount++;
                belowLimitValues.append(numbers[i]).append(" ");
            }
        }
        System.out.println(belowLimitValues.toString().trim() + " are less than the limit " + LIMIT);

        
        double average = (double) sum / TOTAL_NUMBERS;
        System.out.printf("The average is %.1f%n", average);

       
        System.out.print(" ");
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            if (numbers[i] > average) {
                System.out.print(numbers[i] + "  ");
            }
        }
        System.out.println("are greater than the average");
    }
}