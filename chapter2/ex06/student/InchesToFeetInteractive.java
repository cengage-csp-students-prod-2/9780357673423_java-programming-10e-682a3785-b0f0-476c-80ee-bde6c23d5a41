import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        int inches;
        
        System.out.print("Enter a number of inches >> ");
        inches = inputDevice.nextInt();

        int feet = inches / 12;
        int remainingInches = inches % 12;

        System.out.print(inches + " inches converted into feet is "
            + feet + " and " + remainingInches + " inches");
    }
}