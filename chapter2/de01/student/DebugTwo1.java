import java.util.Scanner;

public class DebugTwo1
{
   public static void main(String[] args)
   {
      int oneInt;
      double oneDouble;
      String oneString;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      oneInt = inputDevice.nextInt();
      System.out.print("Enter a double >> ");
      oneDouble = inputDevice.nextDouble();
      inputDevice.nextLine();
      System.out.print("Enter a string >> ");
      oneString = inputDevice.nextLine();
      System.out.print("The int is ");
      System.out.println(oneInt);
      System.out.print("The double is ");
      System.out.println(oneDouble);
      System.out.print("The String is ");
      System.out.println(oneString);
   }
}