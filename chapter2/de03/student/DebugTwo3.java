import java.util.Scanner;
public class DebugTwo3
{
   public static void main(String args[])
   {
      int a, b;
      int result, remainder;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      a = inputDevice.nextInt();
      System.out.print("Enter another integer >> ");
      b = inputDevice.nextInt();
      result = a % b;
      remainder = a / b;
      System.out.println("Divide " + a + " by " + b);
      System.out.println("Result is " + result);
      System.out.println("Remainder is " + remainder);
   }
}