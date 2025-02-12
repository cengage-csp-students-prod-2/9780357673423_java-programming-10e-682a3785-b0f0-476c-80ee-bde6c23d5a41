import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String[] args)
    {
        double length;
        double height;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the room's length >> ");
        length = input.nextDouble();
        System.out.print("Enter the room's width >> ");
        width = input.nextDouble();
        System.out.print("Enter the room's height >> ");
        height = input.nextDouble();

        
        double price = computeArea(length, height, width);

        System.out.print("The price to paint the room is $" + price);

        input.close();
    }

    public static double computeGallons(double wallArea){
        return wallArea / 350;
    }
    
    public static double computeArea(double l, double h, double w)
    {
        double wallArea = (l * w * h);
        double gallonsNeeded = computeGallons(wallArea);
        System.out.println("You will need " + gallonsNeeded + " gallons");
        double price = gallonsNeeded * 32;
        return price;
    }


}