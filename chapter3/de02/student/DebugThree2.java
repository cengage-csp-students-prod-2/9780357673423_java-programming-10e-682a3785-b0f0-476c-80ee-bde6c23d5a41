// This application displays some math facts
import java.util.Scanner;
public class DebugThree2
{
   public static void main(String[] args) {
   
      int a, b, c;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      a = input.nextInt();
      System.out.print("Enter a second integer >> ");
      b = input.nextInt();
      System.out.print("Enter a third integer >> ");
      c = input.nextInt();
   
      add(a, b, c);
      subtract(a, b, c);
   }
   
   public static void add(int a, int b, int c) {

      System.out.println("The sum of " + a +
         " and " + b + " is " + (a + b));
      System.out.println("The sum of " + b +
         " and " + c + " is " + (b + c));
      System.out.println("The sum of " + a +
         " and " + c + " is " + (a + c));
      }
  
   public static void subtract(int a, int b, int c){

      System.out.println("The difference between " +
         a + " and " + b + " is "  +  (a - b));
      System.out.println("The difference between " +
         b + " and " + c + " is "  +  (b - c));
      System.out.println("The difference between " +
         a + " and " + c + " is "  +  (a - c));
   }

}