import java.util.Scanner;

public class DebugTwo1
{
   public static void main(String[] args)
   {
      int oneInt;
      double oneDouble;
      String oneString = "Java Programming";
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      oneInt = input.nextInt();
      System.out.print("Enter a double >> ");
      oneDouble = input.nextDouble();
      System.out.print("Enter a string >> ");
      System.out.println(oneString);
      System.out.print("The int is ");
      System.out.println(oneInt);
      System.out.print("The double is ");
      System.out.println(oneDouble);
      System.out.print("The String is ");
      System.out.println(oneString);
   }
}