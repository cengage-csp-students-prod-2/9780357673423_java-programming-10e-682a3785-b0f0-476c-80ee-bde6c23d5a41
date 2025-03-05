import java.util.Scanner;

public class InchConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double inches;
        double feet;
        double yards;
        
        System.out.print("Enter inches >> ");
        inches = input.nextDouble();
        System.out.println(inches + " inches is " + convertToFeet(inches) + " feet");
        System.out.println(inches + " inches is " + convertToYards(inches) + " yards");
    }
        public static double convertToFeet(double inches)
        {
            return (inches / 12);
        }

        public static double convertToYards(double inches)
        {
            return (inches / 12) / 3;
        }
}