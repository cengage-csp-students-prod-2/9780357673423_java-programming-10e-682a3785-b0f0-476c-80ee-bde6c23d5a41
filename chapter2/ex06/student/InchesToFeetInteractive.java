import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        double inches;
        
        System.out.print("Enter a number of inches >> ");
        inches = inputDevice.nextDouble();

        int feet = (int) (inches / 12);
        int remainingInches = (int) (inches % 12);

        System.out.print(inches + " inches converted into feet is "
            + feet + " feet " + "and " + remainingInches + " inches");
    }
}