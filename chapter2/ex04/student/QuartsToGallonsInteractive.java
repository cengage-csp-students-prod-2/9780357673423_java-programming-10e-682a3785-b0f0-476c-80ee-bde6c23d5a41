import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded;
        int divide;
        int remainder;
        
        System.out.print("Enter quarts needed >> ");
        quartsNeeded = input.nextInt();

        divide = quartsNeeded/QUARTS_IN_GALLON;
        remainder = quartsNeeded%QUARTS_IN_GALLON;

        System.out.print("A job that needs " + quartsNeeded + " quarts requires " + divide +
        " gallons plus " + remainder + " quarts");
        
    }
}