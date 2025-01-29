import java.util.Scanner;

public class MileConversionsInteractive {
    public static final int INCHES_IN_MILE = 63360;
    public static final int FEET_IN_MILE = 5280;
    public static final int YARDS_IN_MILE = 1760;
    
    public static void main(String[] args){
        Scanner inputDevice = new Scanner(System.in);
        
        System.out.print("Please enter a number of miles >> ");
        double miles = inputDevice.nextDouble();

        double inches = miles * INCHES_IN_MILE;
        double feet = miles * FEET_IN_MILE;
        double yards = miles * YARDS_IN_MILE;

        System.out.println(miles + " miles converted to inches is " + inches);
        System.out.println(feet + " feet");
        System.out.println("and " + yards + " yards");
    }
}