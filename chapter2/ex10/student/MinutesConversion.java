import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int minutes;
        double hours, days;

        System.out.print("Enter minutes >> ");
        minutes = input.nextInt();
        hours = (minutes / 60);
        days = ((minutes / 60) / 24);
        System.out.print(minutes + " minutes is " + hours + " hours or " + days + " days.");
    }
}