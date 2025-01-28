import java.util.Scanner;
public class DebugTwo2
{
   public static void main(String[] args)
   {
      int a;
      int b;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      a = inputDevice.nextInt();
      System.out.print("Enter another integer >> ");
      b = inputDevice.nextInt();
      System.out.println("The sum is " + (a + b));
      System.out.println("The difference is " + (a - b));
      System.out.println("The product is " + (a * b));
   }
}