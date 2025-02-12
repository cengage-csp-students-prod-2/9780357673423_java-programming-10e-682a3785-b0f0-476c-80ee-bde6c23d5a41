// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
public class DebugThree1
{
   public static void main(String args[])
   {
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble();

      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble();

      calculateTip(check1);
      calculateTip(check2);
    }
    public static double calculateTip(double bill)
    {
       final double RATE = 0.15;
       double tip = bill * RATE;
       System.out.println("The tip should be at least $" + tip);
       return tip;
    }
}